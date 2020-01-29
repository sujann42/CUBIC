package LambdaExpressions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Customer{
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class predicateMain {

    // takes one input type and returns the boolean value
    //predicate is a functional interface and it has the test method

    public static void main(String[] args) {
        //Predicate<String> predicate=(String t)-> t.isEmpty();
        Predicate<Customer> customerPredicate= (Customer t)-> t.getAge()>35;

        System.out.println(customerPredicate.test(new Customer("sunil", 43)));
        System.out.println(customerPredicate.test(new Customer("bimal", 20)));

        //bipredicate will take two parameters and then return the boolean value.

        BiPredicate<String , Integer> integerBiPredicate= (String s, Integer i)->s.length()>i;

        // there is another interface that is supplier which only supplies the stuff but does not take the input.

    }
}
