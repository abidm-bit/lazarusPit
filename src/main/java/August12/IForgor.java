package August12;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IForgor {

    public static void main(String[] args) {

        // Primitive data types
        int today = 12;
        String month = "August";
        char games = 'x';
        boolean stackOverflow = true;
        double ferry = 4.50;
        float ibuprofen = 1E3F;
        System.out.println(" i need "+ibuprofen + " mg ibuprofen stat");

        System.out.println();

        int[] r2 = {3,5,8,550,720};

        double [] d2 = {3.54,7.08,14.5,28.3};

        System.out.println();

        // 3 Collections

        ArrayList<String> software = new ArrayList<String>();
        software.add("Paint"); software.add("Pinball");
        software.add("UTorrent"); software.add("Transmission");
        software.add("Photoshop CS5");
        System.out.println(software);

        System.out.println();

        HashSet<Integer> codes = new HashSet<Integer>();
        codes.add(200); codes.add(201); codes.add(204);
        codes.add(200); codes.add(429); codes.add(401);
        codes.add(400); codes.add(401); codes.add(400);
        codes.add(400);
        System.out.println(codes); // 6 unique
        System.out.println(codes.size());

        System.out.println();

        HashMap<String,Integer> supplyCount = new HashMap<String,Integer>();
        supplyCount.put("paper reams",1);
        supplyCount.put("sticky notes",3);
        supplyCount.put("pens",11);
        supplyCount.put("markers",7);
        supplyCount.put("thumb tacks",91);
        System.out.println(supplyCount);
        System.out.println(supplyCount.entrySet());



    }

}
