package exam03;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(01);
            }
        };

        Random rand = new Random();
        //Set<Integer> nums = new TreeSet<>(comp);
        Set<Integer> nums = new TreeSet<>(Comparator.reverseOrder());
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());

        for (Integer num : nums){
            System.out.println(nums);
        }
    }
}
