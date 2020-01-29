package LocalDateAndTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();

        //LocalDate date= new LocalDate.now;-> it is not possible because the constructor is private

        LocalDate date1= LocalDate.of(2019, Month.DECEMBER,05);
        //instead of using the December we can use the number itself and it is method overloading.

        System.out.println(date);
        System.out.println(date1);
    }
}
