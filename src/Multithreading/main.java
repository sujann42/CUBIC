package Multithreading;

public class main {
    public static void main(String[] args) {
        Dancer dancer1= new Dancer("Jack");
        Thread t1= new Thread(dancer1);
        Dancer dancer2= new Dancer("mark");
        Thread t2= new Thread(dancer2);
        t1.start();
        t2.start();
        for (int i=9;i<=100;i++){
            System.out.println("hello I can give a try");
        }
    }
}
