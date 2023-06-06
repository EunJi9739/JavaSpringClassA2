package exam01;

import java.lang.reflect.Constructor;

public class Student extends Object{
    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public final void method(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) { //Object obj = new Student() ...
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if(id == s.id && name.equals(s.name)){
                return true;
            }
        }
        return false;
        //return super.equals(obj);
    }

    @Override
    public int hashCode() {
        //name -> String 클래스로 만들어진 객체 name
        return name.hashCode() + id;
        //return super.hashCode();
    }
}
