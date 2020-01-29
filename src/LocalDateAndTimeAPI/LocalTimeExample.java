package LocalDateAndTimeAPI;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1= localTime.of(4,30,45 );
        System.out.println(localTime1);
    }
}
