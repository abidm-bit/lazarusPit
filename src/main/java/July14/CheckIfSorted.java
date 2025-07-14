package July14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckIfSorted {
    public static void main(String[] args) {
        ArrayList<String> categories = new ArrayList<>(List.of("classics","fiction","large print","fiction","fiction","test prep","magazine","media"));
        System.out.println(categories);
        System.out.println(checkIfSorted(categories));
        Collections.sort(categories);
        System.out.println(categories);

        System.out.println(checkIfSorted(categories));
        System.out.println();



    }
    static <E extends Comparable<E>> boolean checkIfSorted(E[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].compareTo(arr[i+1])>0){return false;}
        }
        return true;
    }

    static <T extends Comparable<T>> boolean checkIfSorted(ArrayList<T> arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i).compareTo(arr.get(i+1))>0){return false;}
        }
        return true;
    }

}
