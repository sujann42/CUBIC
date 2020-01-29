package LocalDateAndTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo3 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2017, Month.NOVEMBER, 23);
        date=date.plusYears(2);
        date=date.plusDays(2);
        date=date.plusMonths(3);
        System.out.println(date);


    }
}
