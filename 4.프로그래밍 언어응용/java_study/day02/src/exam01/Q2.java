package exam01;

public class Q2 {
    public static void main(String[] args){
        //연습문제2
        //나머지 연산 이용
        for(int i = 1; i <= 40; i++){
            int roomNo = i % 10; // 0~9
            System.out.println("학생" + i + ", 방번호 "+roomNo+"번");
        }
    }
}
