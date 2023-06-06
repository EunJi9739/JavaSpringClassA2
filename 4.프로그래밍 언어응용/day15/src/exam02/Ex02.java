package exam02;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Orange", "Mango", "Melon", "Banana"};
        boolean allMatch = Arrays.stream(fruits).allMatch(s -> s.length() >= 5);
        System.out.println(allMatch); //전부 참일때만 참

        boolean anyMatch = Arrays.stream(fruits).anyMatch(s -> s.length() >= 6);
        System.out.println(anyMatch); //어떠한 요소 중 한개로도 참 -> 참
    }
}
