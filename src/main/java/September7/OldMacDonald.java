package September7;

import java.util.ArrayList;
import java.util.HashMap;

public class OldMacDonald {

    static void vowelIndicesM1(String input){
        input=input.toLowerCase();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)=='a' ||input.charAt(i)=='e'|| input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
                answer.add(i);
            }
        }
        System.out.println(answer);
    }

    // not good because of the 2nd occurrence
//    static void vowelIndicesM2(String input){
//        input=input.toLowerCase();
//        HashMap<Character,Integer> answer = new HashMap<>();
//        for(int i =0;i<input.length();i++){
//            if(input.charAt(i)=='a' ||input.charAt(i)=='e'|| input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
//                answer.put(input.charAt(i),i);
//            }
//        }
//        System.out.println(answer.entrySet());
//    }


    public static void main(String[] args) {
        vowelIndicesM1("wire");

        vowelIndicesM1("stackheap");
        vowelIndicesM1("old macdonald had a farm");
    }

}
