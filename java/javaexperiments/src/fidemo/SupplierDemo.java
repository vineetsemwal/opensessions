package fidemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String args[]){
        IGreet greet1=()->"Hello to lambda";
        IGreet greet2=()->{
            String msg="Welcome to lambda";
            System.out.println("inside greet2 lambda");
            return msg;
        } ;

        String msg1=greet1.message();
        System.out.println("message1="+msg1);

        String msg2=greet2.message();
        System.out.println("message2="+msg2);

        Supplier<String>greet3=()->"hey to Lambda";
        String msg3=greet3.get();
        System.out.println("using predefined supplier="+msg3);

    }
}
