package exam04;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args){
        int[] scores = {90, 80, 100, 55, 66, 89};
        try(FileOutputStream fos = new FileOutputStream("scores.dat");
            DataOutputStream dos = new DataOutputStream(fos)){
            for(int score: scores){
                dos.writeInt(score);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
