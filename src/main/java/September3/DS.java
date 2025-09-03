package September3;

import java.util.*;

public class DS {

    static void primitives(){
        byte b = 9;
        char c = 'w';
        int a = 3;
        long nileRiver = 18000000;
        double moneyLong = 5.25e7;
        System.out.println(b + " " + c+ " " + a + " " + nileRiver );
        System.out.println(moneyLong);
    }

    static void abstractObjects(){
        int [] heavyfoot = {75,63,35,36,65,71};
        char [] whiteCollar = {'n','p','k','m','e'};
        String input1 = "just keep swimming";

        System.out.println(Arrays.toString(heavyfoot));

        System.out.println();

        System.out.println(Arrays.toString(whiteCollar));

        System.out.println();

       for(int i=1;i<=3;i++){ System.out.println(input1);}

        System.out.println();

        ArrayList<String> movies = new ArrayList<>(List.of("Mission Impossible","The Amateur","Fantastic Four","Superman","Caught Stealing"));
        for(String m:movies){
            System.out.print(m + " | ");
        }

        System.out.println();

        HashMap<Integer,String> channels = new HashMap<>();
        channels.put(7,"ABC");
        channels.put(40,"FX");
        channels.put(1413,"G4TV");
        channels.forEach((num,name)-> System.out.print(name + " is on channel " + num + " | "));

        System.out.println();

        HashSet<Integer>speederStopSpeeding = new HashSet<>(List.of(35,35,63,65,63,75,71,66));
        System.out.println(speederStopSpeeding);

        System.out.println();



    }


    public static void main(String[] args) {
        primitives();
        System.out.println();
        abstractObjects();
    }

}
