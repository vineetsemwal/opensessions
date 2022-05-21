package fidemo;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String args[]){
        ISum op1=(num1,num2)->num2+num2;
        int result1=op1.add(3,4);
        System.out.println("result1="+result1);
        BinaryOperator<Integer>op2=(num1,num2)->num2+num2;
        int result2=op2.apply(5,6);
        System.out.println("result2="+result2);

    }
}
