package exam02;

public class Ex02 {
    public static void main(String[] args){
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);
        int num3 = num1.intValue() + num2.intValue();//.intValue(); -> 언박싱

        System.out.println(num3);

        Integer num4 = num3; //Integer.valueOf(num3);

        int num5 = num4 + 20;

    }
}
