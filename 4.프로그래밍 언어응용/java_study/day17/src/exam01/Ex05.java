package exam01;

import java.io.File;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        File file = new File(""); //현재 파일 경로
        String path = file.getAbsolutePath();
        System.out.printf("path: %s%n",path);

        String path2 = path + File.separator+".."+File.separator+".."+File.separator+"tmp";
        System.out.printf("path2 : %s%n",path2);

;        File file2 = new File(path2+File.separator+"test.txt");
        String path3 = file2.getCanonicalPath();
        System.out.printf("path3 : %s%n",path3);

        String fileName = file2.getName(); //파일명만..
        System.out.printf("fileName : %s%n", fileName);

        String filePath = file2.getPath(); //파일명을 포함한 전체 경로
        System.out.printf("filePath : %s%n",filePath);
    }
}
