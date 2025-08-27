package August27;

public class TireRotation implements Runnable{

    // Instead of extending Threads Class, implements Runnable

    private int tireNumber;

    public TireRotation(int tireNumber){
        this.tireNumber=tireNumber;
    }

    @Override
    public void run() {
        System.out.println("Tire # " + tireNumber + " lefty loosie");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Tire # " + tireNumber + " righty tighty");
    }

}
