package July17;

import java.util.HashMap;
import java.util.Stack;

public class DoraTheExplorer {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("engadget","apple");
        map.put("kotaku","activision");

        map.forEach((s,c)->{
            System.out.println(s + " " + c);
        });

    }
}
