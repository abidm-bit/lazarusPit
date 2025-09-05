package August20;

import java.util.ArrayList;
import java.util.HashMap;

public class identifyVowelPlaces {


    // aeiou
    // String to lower case

    //big o: space O(n) , time O(n)
    static void ivp(String input){
        input = input.toLowerCase();
        ArrayList<Integer> vowelIndices = new ArrayList<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'|| input.charAt(i)=='i'||input.charAt(i)=='o'|| input.charAt(i)=='u'){
                vowelIndices.add(i);
            }
        }
        System.out.println(vowelIndices);
    }

    public static void main(String[] args) {

        ivp("DEXTER");
        ivp("confidentiality");
        ivp("integrity");
        ivp("availability");
        ivp("RADAR");
    }
}
