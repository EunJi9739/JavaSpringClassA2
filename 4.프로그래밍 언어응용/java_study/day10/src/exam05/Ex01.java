package exam05;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args){
        Class cls = Student.class;
        MyAnno anno = (MyAnno)cls.getAnnotation(MyAnno.class);
        String value = anno.value();
        System.out.println(value);
        int[] nums = anno.nums();
        System.out.println(Arrays.toString(nums));
        //System.out.println(anno instanceof MyAnno);

    }
}
