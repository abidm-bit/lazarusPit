package August27;

public class TireRotationShop {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
        TireRotation tr = new TireRotation(i);
//        tr.start();  // Because I'm not extending the Threads class, I can't run this step yet
        Thread myThread = new Thread(tr); // Creating a Thread, passing the object
        myThread.start(); // Now I can run this step

            System.out.println(myThread.isAlive()); // check if a Thread has started (is alive)

        }
    }
}
