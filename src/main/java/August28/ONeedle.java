package August28;

public class ONeedle {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            Needle needle = new Needle(i);
            Thread myThread = new Thread(needle);
            myThread.start();
        }
    }
}
