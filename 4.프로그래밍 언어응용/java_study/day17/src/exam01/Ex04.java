package exam01;

import java.io.File;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        String path = "D :"+File.separator + "tmp"+File.separator+"tmp2"+File.separator+"tmp3";
        File dir = new File(path);
        if(!dir.exists()){//디렉토리, 파일의 존재 유무
            //dir.mkdir();
            dir.mkdirs(); //재귀적으로 하위 디렉토리까지 생성
        }

    }
}
