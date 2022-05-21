package fidemo;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String args[]){
        IEven predicate1=(num)->num%2==0;
        boolean result1=predicate1.isEven(10);
        System.out.println("result="+result1);

        Predicate<Integer>predicate2=(num)->num%2==0;
        boolean result2=predicate2.test(13);
        System.out.println("result2="+result2);
    }
}
