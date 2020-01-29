package GENERICS;

import java.util.ArrayList;
import java.util.List;

public class WildCarDemo {
    public static void main(String[] args) {
        List<Car> cars= new ArrayList<Car>();
        Car car1= new Car();
        car1.setColor("white");
        car1.setFuelType("premium");


        cars.add(car1);

        Integer x=100;
        Integer y=x;
        x++;
        y=y+5;
        x++;
        System.out.println(x);
        System.out.println(y);

    }
}
