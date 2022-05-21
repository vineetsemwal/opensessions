package fidemo;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String args[]){
        ILengthFinder function1=(input)->input.length();
        int len1=function1.length("Hello");
        System.out.println("length of Hello is "+len1);

        Function<String,Integer>function2=(input)->input.length();
        int len2=function2.apply("hyderabad");
        System.out.println("length of hyderabad is "+len2);
    }

}
