package September9;

public class DragonLady implements Runnable {

    private int fellowPlayers;
    public DragonLady(int friendly){
        this.fellowPlayers=friendly;
    }

    @Override
    public void run() {
        if(fellowPlayers==1){
            System.out.println("Your UAV is in the Air");
        }
        else {
            System.out.println("Friendly UAV is in the Sky , called in by ally " + fellowPlayers);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }

    }

}
class AirSpace {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){
           DragonLady dragonLady = new DragonLady(i);
           Thread thread = new Thread(dragonLady);
           thread.start();
       }

    }
}
