package exam01;

public class Ex_test {
    public static void main(String[] args){
        //연습문제 1
        int num1 = 20;
        double num2 = 3.0;
        int result1 = num1+(int)num2;

        System.out.println("연습문제1 : "+result1);
        
        //연습문제 2
        for(int i=1; i<40; i++){

        }

        //연습문제 3
        int floor = 3;
        switch (floor){
            case 1 :
                System.out.println("1층 약국입니다.");
                break;
            case 2 :
                System.out.println("2층 정형외과입니다.");
                break;
            case 3 :
                System.out.println("3층 피부과입니다.");
                break;
            case 4 :
                System.out.println("4층 치과입니다.");
                break;
            case 5 :
                System.out.println("5층 헬스클럽입니다.");
                break;
        }

        //연습문제 4
        for(int i=1; i<=9; i++){
            if(i%2==1){
                System.out.println("======="+i+"단 =======");
                for(int j =1;j<=9;j++){
                    System.out.println(i+" X "+j+" = "+(i*j));
                }
            }
        }

        //연습문제 5
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
