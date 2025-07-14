package July14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SalmonNotSalman {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.addAll(List.of(7,-167,451,-125,31,35,47,-12));
//        list.stream().filter(e->e%2==0).forEach(System.out::println);
//        System.out.println("there are "+list.stream().filter(e->e%2==0).count()+" even #s");
//        System.out.println();
//        list.stream().filter(e->e%2!=0).forEach(System.out::println);
//        System.out.println("there are "+list.stream().filter(e->e%2!=0).count()+" odd #s");

        // Iterate through an array,  check if a String contains a character
        String[] input = {"boyz n the hood","paid in full","new jack city"};
        Arrays.stream(input).filter(e->e.contains("c")).forEach(System.out::println);

        // Given an array of integers, find the unique elements
        Integer[] s1 = {1,1,2,3,3,4,7};
        HashSet<Integer> fame =  new HashSet<>(List.of(s1));
        // Add to a HashSet (stores unique items only)
        System.out.println(fame);
        // Stream
//        Arrays.stream(s1).distinct().forEach(System.out::println);
        List<Integer> answer = Arrays.stream(s1).distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(answer);

        System.out.println();
        int x = IntStream.rangeClosed(1,6).reduce(1, (a,b)->a*b);
        System.out.println(x);



    }


}
