package exam02;

public class Ex03 {
    public static void main(String[] args){
        C c = new C();

        //다형성
        A a = c;
        B b = c;

        C cc=(C)a;



    }
}
