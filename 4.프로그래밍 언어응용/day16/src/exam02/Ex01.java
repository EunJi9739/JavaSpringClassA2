package exam02;

public class Ex01 {
    //해당 패키지 소스 확인 필요
    public static void main(String[] args){
        Implcalculator cal1 = new Implcalculator();
        RecCalculator cal2 = new RecCalculator();

        long sTime = System.nanoTime();

        long result1 = cal1.factorial(10);
        System.out.println("cal1="+result1);

        long eTime = System.nanoTime();

        System.out.println("cal1 걸린 시간 : "+(eTime -sTime));

        long result2 = cal2.factorial(10);
        System.out.println("cal2="+result2);

        eTime = System.nanoTime();
        System.out.println("cal2 걸린 시간 : "+(eTime -sTime));

    }
}
