package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03 {
    public static void main(String[] args){
        List<Long> nums = new ArrayList<>();
        Collections.addAll(nums, 1L,2L,3L,4L,5L,6L);
        System.out.println(nums);

        //List<Integer> checkedNums = Collections.checkedList(nums,Integer.class);
        //System.out.println(checkedNums);

        //다음일차에 알려줌...

        List<String> chars = Arrays.asList("1","2","3","4");
        Collections.fill(chars, "*");
        System.out.println(chars);


    }
}
