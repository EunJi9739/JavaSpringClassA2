package exam05;

import exam04.Student;

public class Book {
    static Student s1 = new Student();
    int id; //책 번호
    String title; //책 제목
    public void showTitle(){
       System.out.println(title);

    }
}
