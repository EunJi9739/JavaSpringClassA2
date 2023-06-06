package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex09 {
    public static void main(String[] args){
        //int[] nums = IntStream.range(0, 10).toArray(); - 10 포함 X
        //int[] nums = IntStream.rangeClosed(0, 10).toArray(); //- 10 포함
        //System.out.println(Arrays.toString(nums));

        IntStream stm1 = IntStream.rangeClosed(0, 50); //0~50 IntStream
        IntStream stm2 = IntStream.rangeClosed(51, 100); //51 ~ 100 IntStream

        IntStream stm3 = IntStream.concat(stm1, stm2);

        int total = stm3.filter(n -> n % 2 == 1).sum();
        System.out.println(total);

        int total2 = IntStream.rangeClosed(0, 100).filter(n -> n % 2 ==1).sum();
        System.out.println(total2);

    }
}
