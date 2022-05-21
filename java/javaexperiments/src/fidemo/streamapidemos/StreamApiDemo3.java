package fidemo.streamapidemos;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApiDemo3 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hi");
        list.add("bye");
        list.add("good");
        StreamApiDemo3 demo = new StreamApiDemo3();
        System.out.println("**print different elements");
        demo.printDifferentElements(list);
        System.out.println("***print length of all elements");
        demo.printLengthOfAllElements(list);
        System.out.println("***print max length");
        demo.printMaximumLength(list);
        System.out.println("***print min length");
        demo.printMinimumLength(list);
        System.out.println("sort and print even elements ");
        demo.sortListOfEvenElements(list);
    }

    /**
     * prints different elements
     */
    public void printDifferentElements(Collection<String> collection) {
        Consumer<String> consumer = System.out::println;
        Stream<String> stream1 = collection.stream();
        Stream<String> stream2 = stream1.distinct();
        stream2.forEach(consumer);
    }

    public void printLengthOfAllElements(Collection<String> collection) {
        Stream<String> stream1 = collection.stream();
        Function<String, Integer> fun = (str) -> str.length();
        Stream<Integer> stream2 = stream1.map(fun);
        Consumer<Integer> consumer = System.out::println;
        stream2.forEach(consumer);
    }

    public void printMaximumLength(Collection<String> collection) {
        Stream<String> stream1 = collection.stream();
        Function<String, Integer> fun = (str) -> str.length();
        Stream<Integer> stream2 = stream1.map(fun);
        Comparator<Integer> comparator = Integer::compare;
        Optional<Integer> optional = stream2.max(comparator);
        if (optional.isPresent()) {
            int maxLength = optional.get();
            System.out.println(maxLength);
        } else {
            System.out.println("length is zero");
        }

    }


    public void printMinimumLength(Collection<String> collection) {
        Stream<String> stream1 = collection.stream();
        Function<String, Integer> fun = (str) -> str.length();
        Stream<Integer> stream2 = stream1.map(fun);
        Comparator<Integer> comparator = Integer::compare;
        Optional<Integer> optional = stream2.min(comparator);
        if (optional.isPresent()) {
            int minLength = optional.get();
            System.out.println(minLength);
        } else {
            System.out.println("length is zero");
        }

    }

    public void sortListOfEvenElements(List<String>list){
       Stream<String>stream1= list.stream();
       Stream<String>stream2=stream1.filter(str->(str.length() %2)==0)  ;
       Comparator<String>comparator=String::compareTo;
       Stream<String>stream3 =stream2.sorted(comparator);
       stream3.forEach(System.out::println);

    }


}
