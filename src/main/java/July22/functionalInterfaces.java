package July22;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class functionalInterfaces {

    public static void main(String[] args) {


    /*
     Predicate<T>  Tests a condition and returns a boolean.
     Predicate<Integer> isEven = x -> x % 2 == 0;
     System.out.println(isEven.test(4));  // Output: true
    */


        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));  // Output: true

        Predicate<Integer> isOdd = x -> x % 2 != 0;
        System.out.println(isOdd.test(4)); // Output: false


    /*
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 3));  // Output: 5
    */

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(2, 3));  // Output: 6




    }








}
