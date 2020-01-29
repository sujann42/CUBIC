package StreamsAPI;

import java.util.stream.Stream;

public class MinExample {
    public static void main(String[] args) {
        Stream<String> s= Stream.of("monkey", "gorilla", "bonob");
        s.filter((String t)-> t.length()>5);

    }
}
