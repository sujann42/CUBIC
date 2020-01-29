package LocalDateAndTimeAPI;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println(dateTime);


        LocalDateTime dateTime1= LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println(dateTime1);

        LocalDateTime dateTime2= LocalDateTime.now(Clock.systemUTC());
        System.out.println(dateTime2);

        LocalDateTime dateTime3= LocalDateTime.of(2017, Month.JULY, 12, 10, 35, 55);
        System.out.println(dateTime3);

    }
}
