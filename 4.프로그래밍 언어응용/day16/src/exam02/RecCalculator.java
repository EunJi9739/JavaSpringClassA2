package exam02;

public class RecCalculator implements Calculator{
    @Override
    public long factorial(long num) {
        long sTime = System.nanoTime();
        try {
            if (num < 1)
                return 1;
            return num * factorial(num - 1);
        }finally {
            long eTime = System.nanoTime();
            System.out.println("걸린시간 : "+(eTime - sTime));
        }
    }
}
