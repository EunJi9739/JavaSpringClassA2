package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex08 {
    public static void main(String[] args){
        int[] nums = IntStream.iterate(0, n -> n+2).limit(10).toArray();

        System.out.println(Arrays.toString(nums));

    }
}
