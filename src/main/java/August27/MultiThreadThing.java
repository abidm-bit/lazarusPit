package August27;

public class MultiThreadThing extends Thread{

    /*
        using extend Thread prevents a class from extending other classes,
        so I can implement Runnable
    */

    @Override
    public void run() {
        System.out.println("wax on");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {

        }
        System.out.println("wax off");
    }
}
