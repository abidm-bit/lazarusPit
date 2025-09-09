package September9;

public class DragonLady implements Runnable {

    private int fellowPlayers;
    public DragonLady(int friendly){
        this.fellowPlayers=friendly;
    }

    @Override
    public void run() {
        // if you put up a UAV, the audio is:
        if(fellowPlayers==1){
            System.out.println("Your UAV is in the Air");
        }
        // if you put up a UAV first, & others on ur team call in additional UAVs, then the audio changes:
        else {
            System.out.println("Friendly spy plane inbound , called in by player " + fellowPlayers);
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
