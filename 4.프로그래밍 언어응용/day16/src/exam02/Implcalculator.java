package exam02;

public class Implcalculator implements Calculator{
    @Override
    public long factorial(long num) {
        long sTime = System.nanoTime();
        try{
            long total = 1L;
            for(long i = 1L; i <= num; i++){

                total *= i;
            }
            return total;
        }finally {
            long eTime = System.nanoTime();
            System.out.println("걸린 시간 : "+(eTime-sTime));
        }

    }
}
