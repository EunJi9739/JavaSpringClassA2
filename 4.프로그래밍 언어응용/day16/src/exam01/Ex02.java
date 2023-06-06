package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("test1.txt")){
            byte[] buffer = new byte[4];
            while (fis.available() > 0){
                int cnt = fis.read(buffer);//반환값 : 읽어온 바이트 수
                for(int i = 0; i<cnt; i++){
                    System.out.println((char)buffer[i]);
                }
                //System.out.println(Arrays.toString(buffer));
                /*
                for(byte b : buffer){
                    System.out.print((char)b);
                }*/
                System.out.println();
                //기존위치에 덮어 씌우기 때문에 마지막에 QROP로 표시됨.

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
