package ExecutorClass;

public class Executor implements Runnable {
     private String name;
    public Executor(String name){
        this.name=name;
    }

    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("My name is " + this.name);
        }
    }

}
