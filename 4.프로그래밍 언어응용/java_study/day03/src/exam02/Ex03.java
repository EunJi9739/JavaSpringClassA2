package exam02;

public class Ex03 {
    public static void main(String[] args){
        Student s1 = new Student(); //지역변수 s1
        s1.id = 1000;
        s1.name = "이름1";
        s1.subject = "과목1";
        //System.out.println(s1); //힙에 있는 메모리 주소 출력
        s1.showInfo();

        //System.out.println("s1="+System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "이름2";
        s2.subject = "과목2";
        s2.showInfo();

        //System.out.println("s2="+System.identityHashCode(s2));

        Student s3 = s2;

        s3.name="이름3";
        s3.showInfo();
        s2.showInfo();

        //System.out.println("s3="+System.identityHashCode(s3));
    }
}
