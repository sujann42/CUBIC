package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxExample {
    public static void main(String[] args) {
        Stream<String> s= Stream.of("monkey", "gorilla", "bonob");
       // s.filter((String t)-> t.length()>5);
        Optional<String> optional=s.max((s1,s2)->s1.length()-s2.length());
        if(optional.isPresent()){
            String s1=optional.get();
            System.out.println(s1);

        }else{

        }

        List<String> list= Arrays.asList("sunil", "niroula", "hey");
        list.stream().filter(n->n.length()>3).sorted().limit(4).forEach(System.out::println);

        //one easy way to use without the if else statement
        //the above statement and the down statement will print the same value.
        optional.ifPresent(System.out::println);


    }
}
