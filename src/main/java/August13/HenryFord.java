package August13;

import java.util.stream.IntStream;

public class HenryFord {

    void factorialM1(int digit){
        int output=1;
        while(digit>1){
            output*=digit;
            digit--;
        }
        System.out.println(output);
    }
    // space O(1) , time O(n) depending on digits

    void factorialM2(int n){
        System.out.println(  IntStream.rangeClosed(1,n).reduce(1,(a,b)->a*b));
    }


    public static void main(String[] args) {
    HenryFord hf = new HenryFord();
    hf.factorialM1(6);
        System.out.println();
        hf.factorialM2(4);

    }

}
