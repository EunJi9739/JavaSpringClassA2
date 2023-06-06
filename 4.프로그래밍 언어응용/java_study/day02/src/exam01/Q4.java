package exam01;

public class Q4 {
    public static void main(String[] args){
        //연습문제4
        for(int i=2; i<=9; i++){
            if(i%2==1){
                System.out.println("======="+i+"단 =======");
                for(int j =1;j<=9;j++){
                    System.out.println(i+" X "+j+" = "+(i*j));
                }
            }
        }
    }
}
