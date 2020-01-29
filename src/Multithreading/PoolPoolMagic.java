package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class Magic {
    private static AtomicInteger x= new AtomicInteger(100);

//    public Magic(int x) {
//        this.x = x;
//    }


    public static void poke(){
        x.incrementAndGet();
        x.incrementAndGet();
    }

    public static int getX(){
        return x.get();
    }

    static class DoMagic implements Callable<String>{


        @Override
        public String call() throws Exception {
            Magic.poke();
            return "I have done my job. ";
        }
    }

    public static class PoolPoolMagic{
        public static void main(String[] args) throws InterruptedException {
            ExecutorService service= Executors.newFixedThreadPool(1000);
            for (int x=1;x<=1000;x++){
                service.submit(new DoMagic());


            }
            service.shutdown();


            service.awaitTermination(10, TimeUnit.MINUTES);

            final int result=Magic.getX();
            System.out.println("Result = "+ result);

           // ArrayList<String> n= new List<String>();

        }
    }


}
