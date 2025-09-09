package September9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DBCooper {
    public static void main(String[] args) {
        Queue<Integer> iq = new LinkedList<>(List.of(1,4,5,9,9,5,2));
        iq.removeIf(item -> item % 2 == 0);
        System.out.println(iq);
    }




    }

