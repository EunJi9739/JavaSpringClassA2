package exam02;

import java.util.Objects;

public class Student {
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
}
