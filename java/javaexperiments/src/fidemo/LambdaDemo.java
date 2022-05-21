package fidemo;


public class LambdaDemo {

    public static void main(String args[]){
        IAdder adder1=new IAdder(){
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };
        int result1=adder1.add(3,4);
        System.out.println("result from annonymouse class instance="+result1);

        IAdder adder2=(num1,num2)->num1+num2;
        int result2= adder2.add(2,3);
        System.out.println("result from lambda using inline expression="+result2);

        IAdder adder3=(num1,num2)->{
          int result=num1+num2;
          return result;
        };
        int result3=adder3.add(5,6);
        System.out.println("result from lambda using block ="+result3);

    }
}
