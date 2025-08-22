package August22;

import java.util.stream.IntStream;

public class Combinations {

    /*
    * In a group of 10 people, 3 prizes will be given, how many ways can the prizes be distributed?
    * In a group of X people, Y prizes will be given, how many ways can the prizes be distributed?
    *
    * Combinations : X = sample size    Y = # of objects to work with
    *
    *    10 C  3 = (10!)/(7!) == 10*9*8 = 720
    *    X  C  Y = (X!)/(X-Y!)
    *
    */

    static void numberOfCombinations(int sampleSize,int objects){
        // this is a factorial problem, calculating the factorial using streams:
        int y = IntStream.range(1,(sampleSize-objects)).reduce(1,(a,b)->a*b);
        System.out.println((y) + " combinations");
    }

    public static void main(String[] args) {
        numberOfCombinations(10,3); //720 combinations
    }
}

