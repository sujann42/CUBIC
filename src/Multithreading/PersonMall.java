package Multithreading;

public class PersonMall extends  Thread {
    public PersonMall(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello I am in mall"+Thread.currentThread().getName());
        TrialRoom.use();
    }

    public static void main(String[] args) {
        PersonMall m1= new PersonMall("T1");
        PersonMall m2= new PersonMall("T2");
        PersonMall m3= new PersonMall("T3");
        PersonMall m4= new PersonMall("T4");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}
