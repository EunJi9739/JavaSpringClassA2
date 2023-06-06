package exam03;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    public Student(int id, String name){
         this.id = id;
         this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hashCode='"+hashCode()+'\''+
                '}';
    }

    //동등성 비교의 기준
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
        //return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student student = (Student) obj;
            if (id == student.id && name.equals(student.name)){
                return true;
            }
        }
        return false;
        //return super.equals(obj);
    }

    @Override
    public int compareTo(Student o) {
        //return id - o.id; //오름차순
        //return o.id - id; //내림차순
        //return Integer.valueOf(id).compareTo(o.id); //오름차순
        //return Integer.valueOf(id).compareTo(o.id) * -1; //내림차순
        //return 0;

        //name
        //return name.compareTo(o.name); //오름차순
        return name.compareTo(o.name) * -1; //내림차순
    }
}
