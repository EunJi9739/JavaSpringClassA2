package exam01;

public class Ex11 {
    public static void main(String[] args){

        int total = 0;
        for(int i = 0; i<=100; i++){
            total += i;
            if (i==50){
                break;
            }
        }

        System.out.println("합계 : "+total);
    }
}
