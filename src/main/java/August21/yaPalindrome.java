package August21;

public class yaPalindrome {
    // w.o String Builder , so 2 pointer

        boolean method(String input){
            input=input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
            int start = 0; int end = input.length()-1;
            while(start<end){
                if(input.charAt(start)!=input.charAt(end)){return false;}
                start++;
                end--;
            }
            return true;
        }


    public static void main(String[] args) {
        yaPalindrome yp = new yaPalindrome();
        System.out.println(yp.method("bugs"));
        System.out.println(yp.method("SAAS"));
        System.out.println(yp.method("civic"));
    }
}
