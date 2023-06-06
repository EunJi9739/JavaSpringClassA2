package exam02;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args){
        //무작위 숫자 10개 출력
        Random rand = new Random();
        //rand.ints().limit(10).forEach(n -> System.out.println(n));
        rand.ints().limit(10).forEach(System.out::println);
    }

}
