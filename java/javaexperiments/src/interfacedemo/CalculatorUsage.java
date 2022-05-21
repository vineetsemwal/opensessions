package interfacedemo;

public class CalculatorUsage {

    public static void main(String[] args){
        ICalculator calcy=new SamsungCalculator();
        int result=calcy.add(3,4);
        System.out.println("result="+result);
    }

}
