package exam02;

public class Ex05 {
    public static void main(String[] args){
        Integer num1 = Integer.valueOf(10); //권장사항?
        Integer num2 = Integer.valueOf(10);
        System.out.println("num1 : "+System.identityHashCode(num1));
        System.out.println("num2 : "+System.identityHashCode(num2));

    }
}
