package September3.v3;

import java.util.*;

public class MoarDataStructure {

    public static void main(String[] args) {
        Linear linear = new Linear();
        //    linear.fixedMultiItem();                  // Array

        Dynamic dynamic = new Dynamic();
        //        dynamic.ListArray();                  // ArrayList
        //            dynamic.ListLinked();             // LinkedList
        //                dynamic.BakeACake();          // Stack
        //                      dynamic.gameplay();     // Queue

    }
}

class Linear{

    void fixedMultiItem(){

        /*
                I use arrays to store multiple items
                arrays are static, once set in size
                O(1) to select an element by its index  arrName[index]
                .length() = # of elements in an array
                0(1) to replace an element by its index arrName[index] = newValue;
                O(n) to iterate thru, depending on number of elements
                O(n) to duplicate an array: create an array and iterate thru
                    primitive, Wrapper

         */

        String [] shows = new String[3];            // fixed size
        shows[0]= "Breaking Bad";
        shows[1]= "Better Call Saul";
        shows[2]= "Entergalactic";
        System.out.println(Arrays.toString(shows));


        int [] r2 = {6,3,9,3,7,1,3,1};
        System.out.println(r2.length);              // 8 elements in this Array
        System.out.println(r2[0]);                  // first element: 6
        System.out.println(r2[r2.length-1]);        // last element:  1
        for(int r:r2){
            System.out.print(r + " ");
        }
        System.out.println();
        Arrays.sort(r2);
        System.out.println(Arrays.toString(r2));     // 1,1,3,3,3,6,7,9
        System.out.println();

        String [] movies = new String[5];           // I can store 5 strings
        movies[0] = "Mission Impossible";
        movies[1] = "The Amateur";
        movies[2]= "Fantastic Four";
        movies[3]= "Superman";
        movies[4]= "Weapons";
        movies[4]= "Caught Stealing";
        System.out.println(movies[0]);               // Mission Impossible
        System.out.println(movies[4]);              // overwritten, will print "Caught Stealing"
        for(int i =0; i<movies.length;i++){
            System.out.println(movies[i]);
        }
        System.out.println();


        String [] summerAMC = new String[5];
        for(int i=0;i< movies.length;i++){
            summerAMC[i]=movies[i];
        }
        System.out.println(Arrays.toString(summerAMC));


    }

}

class Dynamic{

    void ListArray(){

        /*
                ArrayLists are dynamic, the size isn't fixed
                Wrapper
                O(1) access elements by index
                .size()
                O(n) to iterate thru, depending on number of elements

        */

        ArrayList<String> fonts = new ArrayList<>();
        fonts.add("Comic Sans"); fonts.add("Verdana"); fonts.add("Times New Roman");
        System.out.println(fonts);                  // print as an array
        for(String f:fonts){
            System.out.print(f + ", ");              // print the List items in one line
        }
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<>(List.of(3,6,9,9,8,6,3));
        System.out.println(numbers.size());                                 //  7 elements
        numbers.forEach(numb-> System.out.print(numb+", "));         // print using a lambda


    }

    void ListLinked(){
        /*
            LinkedLists take up more storage compared to ArrayLists
            but have pointers to follow elements before & after
            O(1) for inserting or deleting elements to the front or end
            O(1) to access the first & last element
            O(n) to iterate thru elements
        */

        LinkedList<String> home = new LinkedList<>();
        home.add("standing desk"); home.add("carpet"); home.add("bookcase");
        System.out.println(home.getFirst()); // get the first element: standing desk
        System.out.println(home.getLast()); // get the last element: bookcase
        home.addLast("sofa");
        home.addFirst("gaming chair");
        for(String furn:home){
            System.out.print(furn + " ");
        }
        System.out.println();
        System.out.println(home.size() + " elements"); // 5 elements after adding new elements
    }

    void BakeACake(){
        /*
        O(n) to iterate thru
        O(1) to access the top item, porque LIFO
        O(1) to add to a stack .add / .push
         O(1) to remove .pop
        */

        Stack<String> games = new Stack<>();
        games.add("GTA V");
        games.add("UFC");
        games.add("Sifu");
        System.out.println(games.peek()); // first element on top , expect Sifu, being the latest game
        for(String g:games){
            System.out.print(g + ", ");
        }

    }

    void gameplay(){
        /*
            Queues are FIFO, think of it as a procedure / line
            O(n) to iterate thru
            O(1) to add
        */
        Queue<String> codmw4 = new LinkedList<>();
        codmw4.offer("Gun Range");
        codmw4.offer("Ship");
        codmw4.offer("Invasion");
        codmw4.offer("Chernobyl");
        Iterator<String> missions = codmw4.iterator();
        while(missions.hasNext()){
            System.out.println(missions.next());
        }
        System.out.println();
        Queue<Integer> eyeglass = new ArrayDeque<>();
        eyeglass.add(3971);
        eyeglass.offer(3972);
        System.out.println("3971 has to leave");
        eyeglass.remove();
        eyeglass.add(3973);
        eyeglass.add(3974);
        System.out.println("3974 was called three times, next customer");
        eyeglass.offer(3975);
        for(Integer li:eyeglass){
            System.out.println("Customer "+ li);
        }

    }


}

