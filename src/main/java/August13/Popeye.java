package August13;




public class Popeye {


    static boolean armstrongCheckM1(String input){
        String[]process = input.split("");
        double check = 0;
        for(String digit:process){
            check+=Math.pow(Double.parseDouble(digit),input.length());
        }
        return Double.parseDouble(input)==check;
    }


    public static void main(String[] args) {

        String a = "153";
        String b = "370";
        String c = "371";
        String d = "1634";
        String e ="9474";

        System.out.println(armstrongCheckM1(a));
        System.out.println(armstrongCheckM1(b));
        System.out.println(armstrongCheckM1(c));
        System.out.println(armstrongCheckM1(d));
        System.out.println(armstrongCheckM1(e));

    }

}
