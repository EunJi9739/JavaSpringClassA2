package exam02;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex05 {
    public static void main(String[] args){
        String[] fruits = {"apple", "orange", "mango", "banana", "melon"};
                        //중간 연산 - Stream 객체 반환
        Stream<Integer> stmt = Arrays.stream(fruits)
                                        .map(s -> s.length())
                                        .map(n -> n*n)
                                        .filter(n->n >= 30);

        //최종 연산 - Stream 외의 값을 반환
        stmt.forEach(s -> System.out.println(s));

    }
}
