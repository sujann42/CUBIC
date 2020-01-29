package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DancerExecuterExample {
    public static void main(String[] args) {
        Dancer d1= new Dancer("male");
        Dancer d2= new Dancer("pathak bhalu");
        Dancer d3= new Dancer("bhatte");
        Dancer d4= new Dancer("roshan");
        Dancer d5= new Dancer("arjun");

        ExecutorService executor=Executors.newFixedThreadPool(2);
        executor.execute(d1);
        executor.execute(d2);
        executor.execute(d3);
        executor.execute(d4);
        executor.execute(d5);

        System.out.println("@@@");
        executor.shutdown();

    }
}
