package September2;

import java.util.*;
import java.util.stream.Stream;

public class DoraTheExplorer {


    public static void main(String[] args) {

        HashMap<String,Integer> tasks = new HashMap<>();
        tasks.put("HashMap",8);
        tasks.put("Data Structures",4);
        tasks.put("Memory Allocation",2);
        tasks.put("LeetCode",10);
        tasks.put("API Authorization",3);


            // line by line
            for(String item:tasks.keySet()){
                System.out.println(item + " " + tasks.get(item));
            }

        System.out.println();

            // as an array
             System.out.println(tasks.entrySet());

        System.out.println();

            // as an object
            System.out.println(tasks);

        System.out.println();

        String input = "watagatapitusberry";
        char [] process = input.toCharArray();
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(char each:process){
            charCount.put(each,charCount.getOrDefault(each,0)+1);
        }

        charCount.forEach((character, integer) -> System.out.println(character + " " + integer));
        System.out.println();

        Queue<String> printer = new LinkedList<>();
        printer.add("yellow graph paper");
        printer.add("grey graph paper");
        printer.add("rest api notes");

        Iterator<String> order = printer.iterator();
        while(order.hasNext()){
            System.out.println(order.next());
        }

        System.out.println();

        Deque<Integer> ios = new ArrayDeque<>();
        ios.add(6);
        ios.add(7); // major
        ios.add(8);
        ios.add(9);
        ios.add(17);
        ios.add(25); // major
        for(Integer vz:ios){
            System.out.print(vz+" ");
        }
        ios.removeFirst();
        System.out.println();
        for(Integer vz:ios){
            System.out.print(vz + " ");
        }



    }




}
