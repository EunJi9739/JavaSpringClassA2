package exam02;

public class Ex02 {
    public static void main(String[] args){
        int re = add(10,20); //re -> 지역변수
        //System.out.println(re);
    }

    static int add(int num1, int num2){ //코드 -> num1 = 10, num2 = 20, 지역
        int result = num1 + num2;
        return result;
    }

    static int add(int num1, int num2, int num3){ //코드 -> num1 = 10, num2 = 20, 지역
        int result = num1 + num2;
        return result;
    }
}
