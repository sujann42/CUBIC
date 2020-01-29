package Multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Runner implements Runnable{
    private String taskName;
    public Runner(String taskName){
        this.taskName= taskName;
    }
    @Override
    public void run(){
        for (int x=1;x<=100 ;x++){
            System.out.println("task says"+ taskName+" x= "+ x);
        }
    }
}

public class ExecutorFramework  {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService executor= Executors.newFixedThreadPool(3);
        Runner task1= new Runner("Task1");
        Runner task2= new Runner("Task2");
        Runner task3= new Runner("Task3");
        Runner task4= new Runner("Task4");
        Runner task6= new Runner("Task6");

        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
        executor.execute(task4);
    //closing the thread pool after all the task are completed.

        executor.shutdown();

        //Runner task6 = new Runner(task6);   this cannot be done as it already shutdown.

            executor.awaitTermination(10, TimeUnit.MINUTES);





        System.out.println("this is the main thread.");



    }
}
