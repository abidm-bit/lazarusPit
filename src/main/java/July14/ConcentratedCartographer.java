package July14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ConcentratedCartographer {
    public static void main(String[] args) {

        HashMap<Integer,String> psn = new HashMap<>();
        psn.put(5834298,"Call of Duty: Black Ops");
        psn.put(7685348,"Assassin's Creed 2");
        psn.put(9374582,"Call of Duty: Modern Warfare 3");


        System.out.println("print the hashmap");
        System.out.println(psn);
        System.out.println();
        System.out.println("set view of maps");
        System.out.println(psn.entrySet());
        System.out.println();
        System.out.println("loop thru each key & get each value");

        for(Integer key : psn.keySet()) {
            System.out.println(key + " : " + psn.get(key));
        }

        System.out.println();
        System.out.println("lambda");

        psn.forEach((key,value) -> System.out.println(key + " : " + value));

        System.out.println();

        String input = "watagatapitusberry";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : input.toCharArray()){map.put(c,map.getOrDefault(c,0)+1);}
        System.out.println("the frequency count of "+input+" is "+map);

    }

}
