package LambdaExpressions;


import java.util.function.Predicate;

class Vehicle{
    String name;
    int price;

    public Vehicle(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
        //predicate will take the arbitrary type input and will return the boolean values

//        Predicate<Vehicle> predicate= new Predicate<Vehicle>() {
//            @Override
//            public boolean test(Vehicle vehicle) {
//                return vehicle.getName().length()>5;
//            }
//        };

        // since there is only one method declaration we can write in many ways
      //  Predicate<Vehicle> predicate= (Vehicle v)-> v.getName().isEmpty();
        //Predicate<Vehicle> predicate= v-> v.getName().isEmpty();
        Predicate<String> predicate= String::isEmpty;

        System.out.println(predicate.test("portsche"));

        System.out.println(predicate.test(""));
        System.out.println(predicate.test("ferrari"));




    }
}
