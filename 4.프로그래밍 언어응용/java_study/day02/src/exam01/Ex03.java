package exam01;

public class Ex03 {
    public static void main(String[] args){
        boolean result = 10 > 5;
        System.out.println(result); //true

        boolean result2 = true && true;
        boolean result3 = true || false;

        System.out.println(result2);
        System.out.println(result3);

        //10 이상 100 이하인 수인가?
        int num = 20;
        boolean result4 = num >= 10 && num <= 100;
        System.out.println(result4);
    }
}
