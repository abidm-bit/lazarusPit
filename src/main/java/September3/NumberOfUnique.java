package September3;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class NumberOfUnique {


    // Generics ( pass Elements)
    // Count the # of unique elements
    // M1 = stream
    // M2 = HashSet


    // I'm using Generics E so I can pass any array type , ints, chars, Strings

    // M1 = Stream
    private <E extends Comparable > void uniqueM1(E []input){
        System.out.println(Stream.of(input).distinct().count());
    }

    // M2 = HashSet
    private <E extends Comparable > void uniqueM2(E[]input){
        HashSet<Integer> counter = new HashSet(List.of(input));
        System.out.println(counter.size());
    }


    public static void main(String[] args) {
        NumberOfUnique nou = new NumberOfUnique();
        Character [] inp1 = {'w','a','t','a','g','a','t','a','p','i','t','u','s','b','e','r','r','y'};
        nou.uniqueM1(inp1); //12
        nou.uniqueM2(inp1); //12
        System.out.println();
        Integer [] inp2 = {35,35,63,65,63,75,71,66};
        nou.uniqueM2(inp2); //6
        nou.uniqueM2(inp2); //6

    }

}
