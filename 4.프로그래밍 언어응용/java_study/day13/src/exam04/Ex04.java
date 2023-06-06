package exam04;

import java.util.function.Function;

public class Ex04 {
    public static void main(String[] args){
        //Function<String, String> func1 = s -> s; //항등함수
        Function<String, String> func1 = Function.identity();
        String str = func1.apply("값");
        System.out.println(str);
    }
}
