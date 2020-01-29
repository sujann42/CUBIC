package LocalDateAndTimeAPI;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();

        System.out.println("Addition of Days"+ date.plusDays(5));
        // there are many methods like this inside the date and time api
    }
}
