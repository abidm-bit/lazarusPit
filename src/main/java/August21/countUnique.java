package August21;

import java.util.Arrays;
import java.util.HashSet;

public class countUnique {
    //Count Unique Elements in an Array

    // big o: space & time O(n)
    <T extends Comparable > void methodm1(T []input){
        System.out.println(Arrays.stream(input).distinct().count());
    }

    // big o: space & time O(n)
    <T extends Comparable > void methodm2(T []input){
        HashSet<T> process = new HashSet<>(Arrays.asList(input));
        System.out.println(process.size());
    }

    public static void main(String[] args) {

        Character []ip1 = {'t','a','s','a','v','t','r','f'};

        countUnique cu = new countUnique();
        cu.methodm1(ip1);
        System.out.println();
        cu.methodm2(ip1);

    }
}
