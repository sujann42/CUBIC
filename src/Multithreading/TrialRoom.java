package Multithreading;

 class TrialRoom {
    synchronized public static void use(){
        String name=Thread.currentThread().getName();
        System.out.println("hello my name is "+name);
        System.out.println("I am using this Trial Room");

        try {
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
