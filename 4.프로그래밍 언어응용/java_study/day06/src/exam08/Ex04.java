package exam08;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        IntConsumer c = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        };
        IntStream.rangeClosed(1, 100).forEach(c);
    }
}
