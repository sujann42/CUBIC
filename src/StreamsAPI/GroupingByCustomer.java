package StreamsAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByCustomer {
    public static void main(String[] args) {
        Stream<Customer> customers= Stream.of(new Customer("sunil","sunilniroula1@gmail.com",25),
               new Customer("bimal", "pathak@gmail.com", 22),
               new Customer("yubaraj", "bhatte@gmail.com", 25) );


       // Map<Integer, List<Customer>> maps=customers.collect(Collectors.groupingBy((Customer t)->t.getAge()));
        Map<Integer, List<Customer>> maps=customers.collect(Collectors.groupingBy((Customer::getAge)));
      //  System.out.println(maps);
        maps.forEach((age, List)->{
            System.out.println("age"+age);
            System.out.println("list"+ List);
            System.out.println("******************");
        });
    }
}
