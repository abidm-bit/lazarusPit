package August22;

import java.util.ArrayList;
import java.util.List;

public class Fridayy {

//     Reverse a List of Integers (Without Using collections.reverse(ListName))

    void revList(ArrayList<Integer> input){
        for(int i = input.size()-1;i>=0;i--){
            System.out.print(input.get(i)+ " ");
        }
    }



    public static void main(String[] args) {
    ArrayList<Integer> heavyFoot = new ArrayList<>();
    heavyFoot.addAll(List.of(35,36,34,65,75));

    Fridayy fr = new Fridayy();
    fr.revList(heavyFoot);


    }


}
