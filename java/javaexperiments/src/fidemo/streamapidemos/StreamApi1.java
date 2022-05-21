package fidemo.streamapidemos;

import interfacedemo.SamsungCalculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class StreamApi1 {

    public static void main(String args[]) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("samsung galaxy", "phone", 20000));
        list.add(new Product("samsung tv", "tv", 50000));
        list.add(new Product("mototolla phone", "phone", 15000));

       StreamApi1 demo = new StreamApi1();
       double total1=demo.calculateTotal1(list);
       double total2=demo.calculateTotal2(list);
        System.out.println("total1="+total1);
        System.out.println("total2="+total2);
    }

    public double calculateTotal2(Collection<Product>products){
      Optional<Double>optional= products.stream()
                .filter(product->product.getType().equals("phone"))
                .map(product->product.getPrice())
                .reduce((price1,price2)->price1+price2);
        if(!optional.isPresent()){
            return 0;
        }
       double total= optional.get();
        return total;
    }

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
