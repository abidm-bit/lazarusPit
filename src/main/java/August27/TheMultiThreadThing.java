package August27;

public class TheMultiThreadThing extends Thread{

    private int threadCount;

    public TheMultiThreadThing(int threadCount){
    this.threadCount=threadCount;
    }

    @Override
    public void run() {
        System.out.println("Tire #"+ threadCount +" lefty loosie" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {

        }
        System.out.println("Tire #"+ threadCount +" righty tighty");
    }
}
