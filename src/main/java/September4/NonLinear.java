package September4;

import java.util.HashMap;

public class NonLinear {
    public static void main(String[] args) {
        Dora dora = new Dora();
        dora.whereOnTheMap(); // HashMap

    }
}


class Dora{
      /*
        HashMap
        Store data in key value pairs , Two data types
        Doesn't maintain insertion order, stores values in LIFO
        so the latest value is stored for a duplicate key
        O(1) to access an element by Key
        O(n) to iterate thru
    */

    void whereOnTheMap(){

      HashMap<String,Double> cardGraded = new HashMap<>();
      cardGraded.put("Aaron Judge Rookie PSA",9.0);
      cardGraded.put("Holographic Lucario",8.5);
      cardGraded.put("Holographic Lucario",9.5); // This replaces the previous entry for the Holographic Lucario
      cardGraded.put("Lebrawn Jamez",8.0);
      cardGraded.put("Derrick Rose",9.5);

      // loop thru , line by line
        for(String card:cardGraded.keySet()){
            System.out.println(card+" "+cardGraded.get(card));
        }
        System.out.println();

        // using a lambda, line by line

        cardGraded.forEach((card,grade)-> System.out.println(card + " " + grade));

        System.out.println();

        System.out.println(cardGraded.entrySet()); // as an array

        System.out.println();

        HashMap<Integer,String> employeeId = new HashMap<>();
        employeeId.put(204,"Messer O'Reilly");
        employeeId.put(205,"Aay Ayron");
        employeeId.put(280,"Oshack Hensy");
        System.out.println(employeeId.get(205)); // "Aay Ayron"
    }

}



class Unique{
     /*
        HashSets store unique items only
    */
}


class Peah{
    /*
        Heap
    */
}
