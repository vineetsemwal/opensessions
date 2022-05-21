package fidemo;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args){
        ISquare op1=(num)->num*num;
        int result1=op1.square(5);
        System.out.println("result1="+result1);

        UnaryOperator<Integer>op2=(num)->num*num;
        int result2=op2.apply(6);
        System.out.println("result2="+result2);


    }
}
