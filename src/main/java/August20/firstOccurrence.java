package August20;

import java.util.stream.IntStream;

public class firstOccurrence {

    static void answer(int[]input,int target){
        int output = IntStream.of(input).filter(e->e==target).findFirst().getAsInt();
        for(int i=0;i<input.length;i++){
           if(input[i]==output){
               System.out.println(i);
               break; // needed to print only the first otherwise, it'll print all indices
           }
        }
    }

    public static void main(String[] args) {
        int[] dee2 = {8,2,1,3,2};
        answer(dee2,2);
    }


}
