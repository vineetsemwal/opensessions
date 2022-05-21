package fidemo.streamapidemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApiDemo3 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hi");
        list.add("bye");
        StreamApiDemo3 demo = new StreamApiDemo3();
        System.out.println("**print different elements");
        demo.printDifferentElements(list);
        System.out.println("***print length of all elements");
        demo.printLengthOfAllElements(list);
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

}
