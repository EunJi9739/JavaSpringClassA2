package exam02;

import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args){
        HashSet<String> students = new HashSet<>();
        students.add("이름1");
        students.add("이름1");
        students.add("이름2");
        students.add("이름3");
        students.add("이름4");
        students.add("이름5");

        System.out.println(students);
    }
}
