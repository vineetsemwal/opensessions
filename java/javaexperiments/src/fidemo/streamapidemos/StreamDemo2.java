package fidemo.streamapidemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("bye");
        list.add("good");
        list.add("best");
        StreamDemo2 demo=new StreamDemo2();
        long count1= demo.countEvenStringSkip1(list);
        long count2=demo.countEvenStringSkip1SingleStatement(list);
        System.out.println("cont1="+count1);
        System.out.println("count2="+count2);
    }

    /**
     * find count of all even length strings after skipping one
     */
    public long countEvenStringSkip1(Collection<String> collection){
        Stream<String>stream1= collection.stream();
        Predicate<String>predicate=str->{
            boolean even=  (str.length()%2)==0;
            return even;
        };
        Stream<String>stream2=stream1.filter(predicate);
        Stream<String>stream3=stream2.skip(1);
        long count1=stream3.count();
        return count1;
    }


    /**
     * find count of all even length strings after skipping one
     */
    public long countEvenStringSkip1SingleStatement(Collection<String> collection){
       long count= collection.stream()
                .filter(str->(str.length()%2)==0)
                .skip(1)
                .count();
        return count;
    }


}
