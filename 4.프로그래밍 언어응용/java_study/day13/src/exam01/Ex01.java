package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args){
        int[][] nums = {{1,2,3},{4,5,6}};
        int[][] nums2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(nums));

        //boolean same = Arrays.equals(nums,nums2);
        boolean same = Arrays.deepEquals(nums,nums2);
        System.out.println(same);


    }
}
