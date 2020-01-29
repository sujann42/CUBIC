package StreamsAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class TimeAndDate {

    public static void main(String[] args) {
        instant();
        local();
        offset();
        zoned();
    }

    static void instant(){
        System.out.println("instance"+Instant.now());
    }

    static void local(){
        System.out.println("local"+LocalDateTime.now());
    }

    static void offset(){
        System.out.println("offset"+OffsetDateTime.now());
    }

    static void zoned(){
        System.out.println("zoned"+ZonedDateTime.now());
    }


}
