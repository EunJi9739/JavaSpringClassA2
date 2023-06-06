package exam01;

public class test {
    public static void main(String[] args){
        //20 60 1.5

        int a = 20;
        int b = 30;

        int min = (a < b) ? a : b;
        int num = 0;

        for(int i = 1; i<=min; i++){
            if(a % i == 0 && b % i == 0){
                num = i;
            }
        }

        System.out.println(num);
        System.out.println(a*b/num);

    }
}
