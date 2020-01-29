public class MacBookAir extends MacBook implements Apple {
    @Override
    public void start() {
        //super.start();
        System.out.println("Inside MacbooAir Start");
    }

    @Override
    public void stop() {
        //super.stop();
        System.out.println("Inside MacbookAir Stop");
    }

    public void color(){
        System.out.println(" this is the color of the laptop.");
    }

}
