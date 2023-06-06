package exam01;

public class Q5 {
    public static void main(String[] args){
        //연습문제5
        for(int i =1; i<=9; i++){
            System.out.println("======="+i+"단 =======");
            for(int j=1; j<=9; j++){
                if(i<=j){
                    System.out.println(i+" X "+j+" = "+(i*j));
                }
            }
        }
    }
}
