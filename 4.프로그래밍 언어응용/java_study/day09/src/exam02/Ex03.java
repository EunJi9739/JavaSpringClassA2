package exam02;

public class Ex03 {
    public static void main(String[] args){
        int num1 = 10;
        Integer num2 = num1; //오토 박싱 //Integer.valueOf(num1)

        int num3 = num2 + 20; //언박싱 num2.intValue();
    }
}
