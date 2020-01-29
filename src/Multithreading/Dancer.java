package Multithreading;

public class Dancer implements Runnable {
    private String name;

    public Dancer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int x=1;x<=1000;x++){
            System.out.println("hello my name is "+ this. name);
        }
    }
}
