package exam02;

import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args){
        int total = IntStream.rangeClosed(1, 10).reduce((acc, n)->{
            System.out.println("acc="+acc+", n="+n);
            return acc + n;
        }).orElse(0);

        System.out.println(total);
    }
}
