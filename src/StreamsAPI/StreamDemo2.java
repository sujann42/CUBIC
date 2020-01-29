package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("banana", " apple", " mango");
       Stream< String> stream= list.stream();

       Stream<String> stream1= Stream.generate(()->"sunil");
       //stream1.forEach(System.out::println);

       // streams are created from the list so we change the arrays into lists first and then we change to the stream.

        Stream<Integer> stream2= Stream.iterate(1, (s)->s+1).limit(100);
        stream2.forEach(System.out::println);

    }
}
