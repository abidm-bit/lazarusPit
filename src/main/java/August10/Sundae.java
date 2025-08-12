package August10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sundae {

    public static void main(String[] args) {

        ArrayList<String> desk = new ArrayList<>();
        desk.add("lamp"); desk.add("bowl");
        desk.add("monitor"); desk.add("keyboard");
        desk.add("laptop"); desk.add("lamp"); desk.add("keyboard");

        System.out.println(desk);
        HashSet<String> desk1 = new HashSet<>();

        for(String items:desk){
            desk1.add(items);
        }
        System.out.println();

        System.out.println(desk1);

        System.out.println();

        HashMap<String,Integer> deskCount = new HashMap<>();
        deskCount.put("lamp",1);
        deskCount.put("bowl",2);
        deskCount.put("monitor",1);
        deskCount.put("keyboard",1);
        deskCount.put("laptop",1);
        deskCount.put("laptop",2); // gets stored bc HashMap is LIFO

        System.out.println(deskCount);

    }

}
