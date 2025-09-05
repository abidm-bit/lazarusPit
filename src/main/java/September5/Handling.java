package September5;

public class Handling {


    static void printEoO(Integer input) throws NullPointerException {
       try {
           if(input%2==0){
               System.out.println(input + " iz even");
           }
           else System.out.println(input + " iz odd");

       } catch (NullPointerException nullPointerException){
           System.out.println("you didn't pass an integer to process");
       }
    }

    static void printAte(int[] input) throws ArrayIndexOutOfBoundsException{
        // print the 8th element
       try {
           System.out.println("the 8th element in this array is " +input[7]);
       }
       catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
           System.out.println("this array doesn't have an 8th element, it only has "+ input.length + " elements");
       }
    }
    static void printAte(String[] input) throws ArrayIndexOutOfBoundsException{
        // print the 8th element
        try {
            System.out.println("the 8th element in this array is "+input[7]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("this array doesn't have an 8th element, it only has "+ input.length + " elements");
        }
    }



    static void acceptMethod(String input) {
           if(input.equals("GET")|| input.equals("POST")){
               System.out.println("Request Successful");
           }
    else System.out.println("405 " + input+ "  ");
    }



    public static void main(String[] args)  {

        printEoO(4);
        printEoO(5);
        printEoO(-27);
        printEoO(null); // passed null

        System.out.println();

        int [] tableOfElements = {34,6,26};
        printAte(tableOfElements);
        int [] theGasJustGoes = {35,37,37,35,34,64,65,75,101,85,74};
        printAte(theGasJustGoes);
        String [] tinfoil = {"contrails","covid vaccines","db cooper","scylla"};
        printAte(tinfoil);

        System.out.println();

        acceptMethod("GET");
        acceptMethod("OPTIONS");
    }


}
