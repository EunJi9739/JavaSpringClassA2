package exam04;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Ex03 {
    public static void main(String[] args){
        //1. 숫자 -> 제곱
        //2. 숫자 -> 이진수

        Function<Integer, Integer> func1 = a -> a*a;
        Function<Integer, String> func2 = a -> Integer.toBinaryString(a);

        int num = func1.apply(10);
        System.out.println(num);

        String b = func2.apply(10);
        System.out.println(b);

        Function<Integer, String> func3 = func1.andThen(func2);
        String b2 = func3.apply(10); //10 -> 100 -> 이진수
        System.out.println(b2);

        Function<Integer, String > func4 = func2.compose(func1);
        String b3 = func4.apply(10);
        System.out.println(b3);


    }
}
