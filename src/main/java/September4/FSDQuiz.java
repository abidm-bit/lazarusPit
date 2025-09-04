package September4;

import java.util.HashMap;

public class FSDQuiz {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put(null,"Hello World");
        map.put("Hi",null);
        map.put(null,"World");

        System.out.println(map.entrySet()); // 2nd value for the null key replaces, LIFO
        // so expect [null=World & Hi=null]

    }
}
