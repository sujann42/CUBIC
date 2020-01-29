package ThreadsClass;

public class NumberThreads {
    public static void main(String[] args) {
        //try {
            int n = 8;
            for (int i = 0; i < 8; i++) {
                MultiThread object = new MultiThread();
                object.start();
            }
        //}catch(Exception e){
          //  System.out.println("Exception is caught. ");

    }


}


class MultiThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running. ");
        } catch (Exception e) {
            System.out.println("Exception is caught.");

        }
    }
}
