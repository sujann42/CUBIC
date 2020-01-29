package StreamsAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollect {
        public static void main(String[] args) {
            Stream<String> ohMy=Stream.of("lion","tiger", "bears");
            List<String> list= ohMy.map(s->s.toUpperCase()).collect(Collectors.toList());
            System.out.println(list);
            System.out.println(ohMy.getClass());

            //we are using the collect because with sout stream cannot be printed as it prints the reference of the object.

        }
}
