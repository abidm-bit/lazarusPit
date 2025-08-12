package August12;

public class Revrun {


    static void reverseM1(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb);
    }

    static void reverseM2(String input){
        for(int i = input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }

    public static void main(String[] args) {
        String x = "modelo";
        String y = "stella";
        String z = "ciroc";


        reverseM1(x);
        reverseM1(y);
        reverseM1(z);
        System.out.println();

        reverseM2(x);
        System.out.println();
        reverseM2(y);
        System.out.println();
        reverseM2(z);



    }
}
