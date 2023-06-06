package exam02;

public class C extends B {
    int numC = 30;
    public C() {
        super(); //컴파일러가 추가해 주는 메서드
        System.out.println("C 생성자!");
    }
}
