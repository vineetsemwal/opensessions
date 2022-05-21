package fidemo;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String args[]){
        IPrintStringMultiply multiplier1=(msg,times)->{
          String result="";
          for(int i=0;i<times;i++){
              result=result+msg;
          }
            System.out.println("concat result="+result);
        };
        multiplier1.multiply("hi",3);


        BiConsumer<String,Integer>multiplier2=(msg,times)->{
            String result="";
            for(int i=0;i<times;i++){
                result=result+msg;
            }
            System.out.println("concat result="+result);
        };

        multiplier2.accept("hello",2);


    }
}
