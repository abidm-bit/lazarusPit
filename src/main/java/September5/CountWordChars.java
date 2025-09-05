package September5;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWordChars {

    // Loop thru
    static void processM1(String input){
        input=input.replaceAll(" ","");
        HashMap<String,Integer> carcount = new HashMap<>();
        for(String i:input.split("")){
            carcount.put(i,carcount.getOrDefault(i,0)+1);
        }
            for(String ch:carcount.keySet()){
                System.out.println(ch + " " + carcount.get(ch));
            }
    }

    // Streams
    static void processM2(String input){
        input=input.replaceAll(" ","");
        Map<String,Long> answer = Stream.of(input.split("")).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println(answer.entrySet());
    }

    // Loop thru & append to a StringBuilder
    static void processM3(String input){
        input=input.replaceAll(" ","");
        Map<String,Long> answer = Stream.of(input.split("")).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        StringBuilder sb = new StringBuilder();
        for(String s: answer.keySet()){
            sb.append(s).append(answer.get(s));
        }
        System.out.println(sb);
    }

    // Lambda & append to a StringBuilder
    static void processM4(String input){
        input=input.replaceAll(" ","");
        Map<String,Long> answer = Stream.of(input.split("")).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        StringBuilder sb = new StringBuilder();
        answer.forEach((st,lo)->sb.append(st).append(lo));
        System.out.println(sb);
    }



    public static void main(String[] args) {

        String td1 = "sally sells seashells by the seashore";
        String td3 = "jvm jre jdk";
            processM2(td1);
            processM2(td3);

            System.out.println();

        String tc3 = "how much wood would a woodchuck chuck if a woodchuck could chuck wood";
        processM1(tc3);

        System.out.println();

        String tc4 = "babacda";
        processM3(tc4);

        System.out.println();

        String tc5 = "saasiaaspaas";
        processM4(tc5);

    }

}
