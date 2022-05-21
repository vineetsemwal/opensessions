package interfacedemo;

public class CasioCalculator implements ICalculator{

    @Override
    public int add(int num1, int num2){
        return num1+num2;
    }

}
