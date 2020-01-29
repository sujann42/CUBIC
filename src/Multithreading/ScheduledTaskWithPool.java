package Multithreading;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class DoTransaction implements Runnable{
    @Override
    public void run() {
        System.out.println("hello I have done my job."+ LocalDateTime.now());
        System.out.println("hello I have done my job."+ LocalDateTime.now());
        System.out.println("hello I have done my job."+ LocalDateTime.now());
    }
}

public class ScheduledTaskWithPool {

    public static void m1(){
        System.out.println("you are most welcoame."+ LocalDateTime.now());
    }
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(3);
        m1();
        DoTransaction command= new DoTransaction();
        service.schedule(command, 30, TimeUnit.SECONDS);

        m2();

        service.shutdown();

    }
    public  static void m2(){
        System.out.println("you have done!!!!!!!!!!"+ LocalDateTime.now());
    }

}
