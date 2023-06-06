package exam01;
import java.util.Arrays;
public class Ex01 {
    public static void main(String[] args){
        /*
        * 0.0   0.1   0.2
        * 1.0   1.1   1.2
        * */
        int[][] nums = new int[2][3]; //2행 3열의 이차원 배열.

        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;

        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;
        System.out.println(Arrays.deepToString(nums));
    }
}
