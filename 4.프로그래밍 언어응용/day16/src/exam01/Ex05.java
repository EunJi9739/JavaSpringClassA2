package exam01;

import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args){ //문자 기반 스트림이라서 한글이 안깨짐
        try(FileWriter fw = new FileWriter("test3.txt")){
            fw.write("안녕하세요");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
