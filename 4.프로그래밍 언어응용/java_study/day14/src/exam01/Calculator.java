package exam01;

import java.util.function.IntBinaryOperator;

public class Calculator {

    //private IntBinaryOperator cal = (a, b) -> add(10, 20);
    private IntBinaryOperator cal = this::add;

    public int add(int num1, int num2){
        return num1 + num2;
    }




}
