package fidemo;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String args[]){
        IStringMultply bifun1=(input,times)->{
            String result="";
            for(int i=0;i<times;i++){
                result=result+input;
            }
            return result;
        };
        String result1=bifun1.multiply("hi",3);
        System.out.println("result1 ="+result1);

        BiFunction<String,Integer,String>bifun2=(input,times)->{
            String result="";
            for(int i=0;i<times;i++){
                result=result+input;
            }
            return result;
        };
        String result2=bifun2.apply("hey",4);
        System.out.println("result2="+result2);

    }
}
