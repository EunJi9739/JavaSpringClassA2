package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex10 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("이름1", "이름2", "이름1", "이름3","이름4");

        //중복 제거
        List<String> names2 = names.stream().distinct().toList();

        System.out.println(names2);
    }
}
