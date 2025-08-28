package August28;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Thursday {

    static String vowelCheck(String input){
      if(input.matches(".*[aeiouAEIOU].*")) return input + " has a vowel";
      else return input + " does not have a vowel";
    }

    public static void main(String[] args) {
        System.out.println(vowelCheck("xp"));
        System.out.println(vowelCheck("vista"));
        System.out.println(vowelCheck("pkg"));
    }
}
