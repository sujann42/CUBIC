package Multithreading;

import java.util.Random;
import java.util.concurrent.*;

class NumGem implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {
        int num= new Random().nextInt(100);
        return num;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        NumGem gen1=new NumGem();
       // executor.submit(gen1);
        Future<Integer> future1= executor.submit(gen1);


    }

}
