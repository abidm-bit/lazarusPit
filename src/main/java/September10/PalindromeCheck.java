package September10;

public class PalindromeCheck {

    void methodOne(String input){
        try{
            String two = input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
            StringBuilder sb = new StringBuilder(two);
            sb.reverse();
            if (two.contentEquals(sb.toString())) {
                System.out.println(input + " is a palindrome");
            }
            else System.out.println(input + " is not a palindrome");
        }
        catch (NullPointerException npe){
            System.out.println("you passed a null argument");
        }
    }


    void methodTwo(Object input) {
        try {
            // Convert any object to String
            String two = input.toString().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
            StringBuilder sb = new StringBuilder(two);
            sb.reverse();
            if (two.contentEquals(sb.toString())) {
                System.out.println(input + " is a palindrome");
            }
            else System.out.println(input + " is not a palindrome");
        }
        catch (NullPointerException npe){
            System.out.println("you passed a null argument");
        }

    }


    public static void main(String[] args) {

        PalindromeCheck palindromeCheck = new PalindromeCheck();

        palindromeCheck.methodOne("Civic");
        palindromeCheck.methodOne(null);
        palindromeCheck.methodOne(String.valueOf(123));
//        palindromeCheck.methodOne(123);  won't compile
        System.out.println();
        palindromeCheck.methodTwo(3003); // This method takes any input object, converts it to a String
        palindromeCheck.methodTwo(null);

    }

}
