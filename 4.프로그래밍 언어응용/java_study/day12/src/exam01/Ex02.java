package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args){
        //LinkedList<String> names = new LinkedList<>();
        List<String> names = new ArrayList<>(); //앞에 인터페이스명은 추상클래스명으로 자주 적음.
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        printData(names);
    }

    private static void printData(List<String> names){//(LinkedList<String> names){
        System.out.println(names);
    }
}
