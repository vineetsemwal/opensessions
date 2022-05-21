package fidemo;

import java.util.function.Consumer;

public class PrintDemo {

    public static void main(String args[]){
        IPrint printer1=(msg)-> System.out.println("message is "+msg);
        printer1.print("Hello");

        Consumer<String>printer2=(msg)-> System.out.println("message is "+msg);
        printer2.accept("Hi");


    }
}
