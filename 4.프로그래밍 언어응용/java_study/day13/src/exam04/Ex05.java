package exam04;

import java.util.function.IntPredicate;

public class Ex05 {
    public static void main(String[] args){
        //숫자, 10 이상이고 100이하 인지
        int num = 20;

        IntPredicate func1 = n -> n >= 10;
        IntPredicate func2 = n -> n <= 100;

        IntPredicate func3 = func1.and(func2); //n >= 10 && n <= 100

        boolean result = func3.test(num);
        boolean result2 = func3.test(101);

        System.out.println("result = "+result);
        System.out.println("result2 = "+result2);

        IntPredicate func4 = func1.negate(); // n < 10
        boolean result3 = func4.test(5);
        System.out.println("result3 = "+result3);
    }
}
