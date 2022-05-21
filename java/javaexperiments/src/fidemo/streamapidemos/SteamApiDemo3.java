package fidemo.streamapidemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SteamApiDemo3 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hi");
        list.add("bye");

        Stream<String> stream1 = list.stream();
        Stream<String>stream2=stream1.distinct();
        stream2.forEach(System.out::println);
    }
}
