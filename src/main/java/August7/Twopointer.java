package August7;
public class Twopointer {

    public static void main(String[] args) {

        System.out.println(palindrome("radar"));
    }

static boolean palindrome(String input){
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



}