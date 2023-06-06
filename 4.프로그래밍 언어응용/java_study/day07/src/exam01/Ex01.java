package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("aa.txt");
            //throw new FileNotFoundException(....);

            //파일 읽기 작업 했다...

            //fis.close(); //자원 해제
            System.out.println("자원 해제 완료!");
            return; //함수 종료

        } catch (IOException e){ //FileNotFoundException e = new FileNotFound...
            //System.out.println("예외처리!!");
            //e.printStackTrace();
            try {
                //fis.close();
                //}catch (IOException | NullPointerException e2){
            }catch (Exception e2){ //다형성에 의해서..

            }
        }finally { //예외가 발생하든 안하든 항상 수행되는 코드
            try
            {
                fis.close();
            }catch (IOException | NullPointerException e){
                e.printStackTrace();
            }
            System.out.println("예외가 발생하든 안하든 항상 실행되는 코드!");
        }
        System.out.println("매우 중요한 코드!!!");
    }
}
