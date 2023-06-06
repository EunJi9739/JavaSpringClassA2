package exam06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("a.txt");
        System.out.println(fis instanceof AutoCloseable);

        //-> fis.close();
    }
}
