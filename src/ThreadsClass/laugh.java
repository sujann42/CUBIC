package ThreadsClass;

 class laugh extends Thread{
     public void m1(){
         System.out.println("this is m1");
     }

     public void m2(){
         System.out.println("this is m2");
     }


    @Override
    public void run(){
         this.m1();
        for (int x=1;x<1000;x++){
            System.out.println("I am laughing "+x);
        }
        this.m2();
    }

}


class CryThread extends Thread {
    @Override
    public void run() {
        for (int x = 1; x < 1000; x++) {
            System.out.println("I am crying " + x);
        }
    }
}


     class LaughAndCry{
        public static void main(String[] args) {
            laugh t1= new laugh();
            CryThread t2= new CryThread();
            t1.start();
            t2.start();
        }
    }

