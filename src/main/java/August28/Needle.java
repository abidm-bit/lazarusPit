package August28;

public class Needle implements Runnable{

    private int carsInFormation;

    public Needle(int carNumber){
        this.carsInFormation = carNumber;
    }
    public void run(){
        System.out.println("Car # "+this.carsInFormation + " will speed up");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Car # "+this.carsInFormation + " will cut right");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Car # "+this.carsInFormation + " will cut left");
    }
}

