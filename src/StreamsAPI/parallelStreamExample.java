package StreamsAPI;

import java.util.stream.Stream;

public class parallelStreamExample {
    public static void main(String[] args) {
        Stream<Integer> integers=Stream.of(10,20,30,40,50,60,70,80);
       // integers.forEach(System.out::println);
        integers.forEach((Integer d)-> System.out.print(d+" "));

//        integers=integers.parallel();
//        integers.forEach(System.out::println);

        Stream<Integer> integers1=Stream.of(10,20,30,40,50,60,70,80);

        //System.out.println(integers1.count()); this is a terminal operation
        integers1.parallel();
        System.out.println(integers1.isParallel());

        integers1.forEach((Integer d)-> System.out.print(d+" "));

        System.out.println();
        int processors= Runtime.getRuntime().availableProcessors();
        System.out.println(processors);

        //method reference is the example of lambda expression where we have only one method invocation
    }
}
