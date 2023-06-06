package exam01;


public abstract class Calculator2 {

    int num = 10; // public static final int num = 10; // 정적 상수!!
    public abstract int add(int num1, int num2);
    // 컴파일러가 public abstract 추가 public abstract int add

    public void commonMethod() {
        System.out.println("공통 메서드!");
    }
}
