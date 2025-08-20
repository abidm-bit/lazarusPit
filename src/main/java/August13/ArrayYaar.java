package August13;

import java.util.Arrays;

public class ArrayYaar {

// built in sort time : O(n log n) , then fetch , space O(1)
    void findthevalueM1(int[]arrayInput){
        Arrays.sort(arrayInput);
        System.out.println("the max value is " + arrayInput[arrayInput.length-1]);
        System.out.println("the min value is " + arrayInput[0]);
        System.out.println("the 2nd largest value is " + arrayInput[arrayInput.length-2]);
        System.out.println("the 2nd smallest value is " + arrayInput[1]);
    }

// streams: time & space O(n)
    void findthevalueM2(int[]arrayInput){
        int max =Arrays.stream(arrayInput).max().orElseThrow();
        int min = Arrays.stream(arrayInput).min().orElseThrow();
        int secondMin = Arrays.stream(arrayInput).filter(number->number!=min).min().orElseThrow();
        int secondMax = Arrays.stream(arrayInput).filter(number->number!=max).max().orElseThrow();

        System.out.println("the max value is "+ max);
        System.out.println("the min value is " + min);
        System.out.println("the 2nd largest value is " + secondMax);
        System.out.println("the 2nd smallest value is " + secondMin);
    }

    public static void main(String[] args) {

        int [] r2 = {1,4,1,0,8,3,2,7};

        ArrayYaar ay = new ArrayYaar();
        ay.findthevalueM1(r2);
        System.out.println();
         ay.findthevalueM2(r2);
    }

}

