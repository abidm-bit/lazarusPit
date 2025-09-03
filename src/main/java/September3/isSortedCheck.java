package September3;


import java.util.ArrayList;
import java.util.List;

public class isSortedCheck {


    // for any array of elements
    static  boolean m1(int []input){
        for(int i =1; i<input.length;i++){
            if(input[i-1]>input[i]){
              return false;
            }
        }
        return true;
    }

    // for any list of elements
    static <E extends Comparable> boolean m2(ArrayList<E> input){
        for(int i=1;i<input.size();i++){
            if(input.get(i-1).compareTo(input.get(i))>0){return false;}
        }return true;
    }



    public static void main(String[] args) {

        int[] testdata1= {63,35,71};
        System.out.println(m1(testdata1)); // false , not sorted bc 63 is greater than 35

        System.out.println();

        ArrayList<Integer> testdata2 = new ArrayList<>(List.of(2,3,7));
        System.out.println(m2(testdata2));



    }


}
