package July10;

import java.util.ArrayList;

public class SumElements {
    public static void main(String[] args) {

    }

    static int sum(int[] arr) {
        int sum =0;
        for(int all:arr){sum+=all;}
        return sum;
    }

    static int sum(ArrayList<Integer> arr){
        int sum =0;
        for(int all:arr){sum+=all;}
        return sum;
    }

    static int summ2(ArrayList<Integer> arr){
        return arr.stream().mapToInt(Integer::intValue).sum();
    }


}
