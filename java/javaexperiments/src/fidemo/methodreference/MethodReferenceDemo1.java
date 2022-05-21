package fidemo.methodreference;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo1 {
    public static void main(String[] args){
        Consumer<String>consumer1=(msg)->System.out.println(msg);
        consumer1.accept("hello");
        Consumer<String>consumer2=System.out::println;
        consumer2.accept("hi");

        MethodReferenceDemo1 demo=new MethodReferenceDemo1();
        BinaryOperator<Integer>op1=demo::add;
        int addResult=op1.apply(3,4);
        System.out.println("biopResult="+addResult);

        BinaryOperator<Integer>subOp=MethodReferenceDemo1::sub;
        int subResult=subOp.apply(7,2);
        System.out.println("subtract result="+subResult);

        Function<String,Student> bifun=Student::new;
        Student student=bifun.apply("amit");
        System.out.println("student name="+student.getName());
    }

    public static int sub(int num1, int num2){
        return num1-num2;
    }

    public int add(int num1, int num2){
        return num1+num2;
    }

}
