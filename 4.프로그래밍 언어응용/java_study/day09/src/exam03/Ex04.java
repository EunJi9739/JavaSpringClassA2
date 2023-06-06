package exam03;

import java.util.Objects;

public class Ex04 {
    public static void main(String[] args){
        String[][] strs1 = {{"A", "B", "C"},{"D","E","F"}};
        String[][] strs2 = {{"A", "B", "C"},{"D","E","F"}};

        System.out.println("equals : "+ Objects.equals(strs1,strs2));
        System.out.println("deepEquals : "+Objects.deepEquals(strs1,strs2));

    }
}
