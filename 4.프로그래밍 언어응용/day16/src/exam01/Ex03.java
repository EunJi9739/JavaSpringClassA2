package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args){
        try (FileOutputStream fos = new FileOutputStream("test2.txt")) {
            /*
            for(char ch = 'A'; ch <= 'Z'; ch++){
                fos.write(ch);
            }

             */
            byte[] chars = {65, 66, 67, 68};
            fos.write(chars);

            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
