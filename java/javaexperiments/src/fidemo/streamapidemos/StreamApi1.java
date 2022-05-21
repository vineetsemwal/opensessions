package fidemo.streamapidemos;

import interfacedemo.SamsungCalculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi1 {

    public static void main(String args[]) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("samsung galaxy", "phone", 2000));
        list.add(new Product("samsung tv", "tv", 5000));
        list.add(new Product("mototolla phone", "phone", 1500));
        list.add(new Product("iphone", "phone", 7000));

        StreamApi1 demo = new StreamApi1();
        double total1 = demo.calculateTotal1(list);
        double total2 = demo.calculateTotal2(list);
        double total3 = demo.calculateTotal3(list);
        System.out.println("total1=" + total1);
        System.out.println("total2=" + total2);
        System.out.println("total3=" + total3);
    }

    /**
     * calculate totl prices of all phones
     */
    public double calculateTotal2(Collection<Product> products) {
        Optional<Double> optional = products.stream()
                .filter(product -> product.getType().equals("phone"))
                .map(product -> product.getPrice())
                .reduce((price1, price2) -> price1 + price2);
        if (!optional.isPresent()) {
            return 0;
        }
        double total = optional.get();
        return total;
    }


    /**
     * calculate totl prices of all phones
     */
    public double calculateTotal3(Collection<Product> products) {
        Stream<Product> stream1 = products.stream();
        Predicate<Product> predicate = product -> product.getType().equals("phone");
        Stream<Product> stream2 = stream1.filter(predicate);
        Stream<Double> stream3 = stream2.map(product -> product.getPrice());
        BinaryOperator<Double> operator = (price1, price2) -> price1 + price2;
        Optional<Double> optional = stream3.reduce(operator);
        if (!optional.isPresent()) {
            return 0;
        }
        double total = optional.get();
        return total;
    }


    /**
     * calculate totl prices of all phones
     */
    public double calculateTotal1(Collection<Product> products) {
        double total = 0;
        for (Product product : products) {
            if (product.getType().equals("phone")) {
                total = total + product.getPrice();
            }
        }
        return total;

    }


}
