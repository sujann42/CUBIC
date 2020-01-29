package ThreadsClass;

public class ThreadMain extends Thread {
    public static void main(String[] args) {
        Thread t1= Thread.currentThread();
        System.out.println("id ="+t1.getId());
        t1.setName("thread 1");
        System.out.println("name ="+t1.getName());
        System.out.println("priority ="+t1.getPriority());
        System.out.println("state ="+t1.getState());
        System.out.println("group ="+t1.getThreadGroup());

    }


}
