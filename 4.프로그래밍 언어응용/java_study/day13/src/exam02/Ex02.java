package exam02;

public class Ex02 {
    public static void main(String[] args){
/*
        int c = 20;

        //람다식
        Calculator cal = (a, b) -> {
            //c = 30; //지역변수의 상수화 final int c ...
            return a + b + c;
        };



 */

        Calculator cal = (a,b) -> a+b;
        int result = cal.add(10,20);
        System.out.println(result);

        add(cal);

        add((a,b) -> a+b);
    }

    public static void add(Calculator cal){
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
