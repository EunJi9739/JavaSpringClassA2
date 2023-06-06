package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(2023,3, 10);
        LocalTime time1 = LocalTime.of(23,20,15);

        LocalDateTime datetime1 = LocalDateTime.of(date1, time1);
        System.out.println(datetime1);

        LocalDateTime datetime2 = date1.atTime(time1);
        System.out.println(datetime2);

        LocalDateTime datetime3 = time1.atDate(date1);
        System.out.println(datetime3);


    }
}
