package August20;

import java.util.stream.IntStream;

public class cEcO {

    static void countEvenOdd(int[]arr){
        int evenCount = Math.toIntExact(IntStream.of(arr).filter(e -> e % 2 == 0).count());
        int oddCount = Math.toIntExact(IntStream.of(arr).filter(e -> e % 2 != 0).count());
        System.out.println(evenCount);
        System.out.println(oddCount);
    }

    public static void main(String[] args) {

        int [] r2 = {6,3,5,36,13,31,53,5,343,5,1,9};
        countEvenOdd(r2);

    }
}
