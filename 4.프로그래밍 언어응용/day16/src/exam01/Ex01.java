package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test1.txt")) {
/*
            int ch = 0;
            while((ch = fis.read()) != -1){
                System.out.println((char)ch);
            }
*/
            while (fis.available()>0){
                int ch = fis.read();
                System.out.println((char)ch);
            }
            /*
            int ch = (char)fis.read();
            System.out.println((char)ch+", "+ch);

            ch = fis.read();
            System.out.println((char)ch+", "+ch);

            ch = fis.read();
            System.out.println((char)ch+", "+ch);

            ch = fis.read();
            System.out.println((char)ch+", "+ch);

            ch = fis.read();
            System.out.println((char)ch+", "+ch);
            //-1이 나오면 멈춘다.

             */

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
