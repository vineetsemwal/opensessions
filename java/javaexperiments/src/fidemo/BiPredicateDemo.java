package fidemo;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public  static void main(String args[]){
        ISumEven biPredicate1=(num1,num2)->(num1+num2)%2==0;
        BiPredicate<Integer,Integer>biPredicate2=(num1,num2)->(num1+num2)%2==0;
        boolean result1=biPredicate1.isSumEven(2,6);
        System.out.println("sum even 2,6 ?"+result1);

        boolean result2=biPredicate2.test(6,7);
        System.out.println("sum even 6,7? "+result2);

    }
}
