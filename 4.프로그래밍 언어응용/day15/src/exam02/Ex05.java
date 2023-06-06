package exam02;

import java.util.Arrays;
import java.util.Random;

public class Ex05 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] nums = rand.ints().limit(5).toArray();
        System.out.println(Arrays.toString(nums));

        int max = Arrays.stream(nums).reduce(Integer.MIN_VALUE, (a, b)-> a>b?a:b);
        System.out.println("최대값 : "+max);

        int min = Arrays.stream(nums).reduce(Integer.MIN_VALUE, (a,b) -> a>b?b:a);
        System.out.println("최소값 : "+min);
    }
}
