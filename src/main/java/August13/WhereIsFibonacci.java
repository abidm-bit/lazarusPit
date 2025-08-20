package August13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WhereIsFibonacci {

    void fiboSequenceM1(int digits){
        int[] output = new int[digits-1];
        output[0]=0;
        output[1]=1;
        for(int i=2;i<digits-1;i++){
            output[i]= output[i-2]+output[i-1];
        }
        System.out.println(Arrays.toString(output));
    }
// space & time = O(n) based on # of digits

    static int fibonacciRecursion(int n){
        if(n==0||n==1){return n;}
        else return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }

    static void fibonacciSequenceM2(int n){
        for(int i=0;i<=n;i++){
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    public static void main(String[] args) {
    WhereIsFibonacci whereIsFibonacci = new WhereIsFibonacci();
        whereIsFibonacci.fiboSequenceM1(8);
        System.out.println();

   fibonacciSequenceM2(5);



    }
}
