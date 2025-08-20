package August12;

public class CheckPalindrome {

    static boolean yaThisPalindromeM1(String input){
        input=input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return input.contentEquals(sb);
    }
    // this method takes more storage bc of the StringBuilder object

    // two pointer approach
    static boolean yaThisPalindromeM2(String input){
        int start = 0;
        int end = input.length() - 1;
        input=input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        while(start<end){
            if(input.charAt(start)!=input.charAt(end)){return false;}
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(yaThisPalindromeM2("RaDaR"));
        System.out.println(yaThisPalindromeM1("SAS"));
        System.out.println(yaThisPalindromeM2("rar"));
    }
}
