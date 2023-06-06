package exam02;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
    public static void main(String[] args){

        String n1 = new String("이름1");
        String n2 = "이름1"; //문자열 상수
        System.out.println(n1.equals(n2));
        System.out.println("n1.haseCode() : "+n1.hashCode());
        System.out.println("n2.haseCode() : "+n2.hashCode());

        HashSet<Student> students = new HashSet<>();
        students.add(new Student(1000, "이름1"));
        students.add(new Student(1000, "이름1"));
        students.add(new Student(1001, "이름2"));
        students.add(new Student(1002, "이름3"));
        students.add(new Student(1003, "이름4"));

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()){
            Student s = iter.next();
            System.out.println(s);
        }

        iter = students.iterator(); //다시 써줘야함.
        while (iter.hasNext()){
            Student s = iter.next();
            System.out.println(s);
        }

        for(Student student : students){
            System.out.println(student);
        }
    }
}
