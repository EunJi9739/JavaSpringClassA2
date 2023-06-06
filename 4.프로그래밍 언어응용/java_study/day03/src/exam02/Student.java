package exam02;

public class Student {
    int id; //학번
    String name; //이름
    String subject; //과목

    public Student(){ //기본 생성자 : 컴파일러, 반환값이 없다.
        //객체가 생성된 이후 처리할 작업
        //생성된 객체의 멤버 변수의 초기화 작업
        id = 1000;
        name = "이름1";
        subject= "과목1";
    }

    public Student(int _id, String _name, String _subject){
        id = _id;
        name = _name;
        subject = _subject;
    }

    void showInfo() {
        System.out.println("id="+id+", name="+name+", subject="+subject);
    }
}
