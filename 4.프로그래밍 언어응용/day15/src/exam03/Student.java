package exam03;

public class Student {
    private int ban;

    private int grade;
    private char gender;

    private String name;

    public Student(int ban, char gender, int grade, String name) {
        this.ban = ban;
        this.grade = grade;
        this.gender = gender;
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale(){
        return gender == 'F';
    }

    @Override
    public String toString() {
        return "Student{" +
                "ban=" + ban +
                ", gender=" + gender +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }


}
