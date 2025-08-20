package August13;

public class Swap {


    void creditDefaultSwapM1(String x, String y){
        String z;
        z=x;
        x=y;
        y=z;
        System.out.println(x);
        System.out.println(y);
    }
    // Temp variable , space & time is O(1) bc of the fixed input & variables


    void intSwapM2(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
    }
    // space & time is O(1), fixed inputs & fixed operations

    public static void main(String[] args) {
        String a = "AAA"; String b = "CCC";
        Swap swap = new Swap();
        swap.creditDefaultSwapM1(a,b);

        System.out.println();

        swap.intSwapM2(10,5);

    }
}
