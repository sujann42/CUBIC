package StreamsAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {
        List< String> list= new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("guava");
        list.add("banana");
        list.add("grapes");

        list.forEach(System.out::println);

        //we can use the forEach() function with lists then why are we using the stream for the same purpose.


        System.out.println("-------------------------");
        Stream<String> stream= list.stream();
        // we cannot use the sout directly on streams
        //stream.forEach(s-> System.out.println(s));
       // stream.forEach(s-> System.out.println(s));  -> this will give exception because the terminal operation can be used only once.
        stream.forEach(System.out::println);

        //the elements inside the streams can be printed using the for each () function.
        // for each will always take the consumer.
        // since println is a void function it does not return anything and which does not return anything is a consumer.
        //forEac


    }
}
