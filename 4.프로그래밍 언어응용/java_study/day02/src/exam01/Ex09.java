package exam01;

public class Ex09 {
    public static void main(String[] args){
        /*int total = 0;
        total += 1;
        total += 2;
        total += 3;*/

        int total = 0, num = 1;

        while(num <= 100){
            total += num ;
            num++;
        }
        System.out.println("합계 : "+total);
    }
}
