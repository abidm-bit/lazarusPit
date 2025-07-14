package July14;

import java.util.ArrayList;
import java.util.HashMap;

public class DiffBtwnALHM {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("honda");
        list.add("mazda");
        list.add("ford");
        list.add("honda");

        HashMap<String,String> map = new HashMap<>();
        map.put("electronics","best buy,costco,pc richard");
        map.put("furniture","raymour flanigan,wayfair,macys");
        map.put("home","home depot,lowes,harbor freight");

        System.out.println(list);
        System.out.println(map);
        list.add("ford");
        map.put("home","zillow,redfin,word of mouth");

        System.out.println(list);
        System.out.println(map);

        // ArrayList selection O(1) by index
        // HashMap selection O(1) by key
        // ArrayList FIFO
        // HashMap LIFO

    }
}
