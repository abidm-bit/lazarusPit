package September3.v3;

import java.util.Arrays;

public class MoarDataStructure {

    public static void main(String[] args) {
    Linear linear = new Linear();
    linear.fixedMultiItem(); // Arrays

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
                O(n) to duplicate an array: create an array and iterate thru

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