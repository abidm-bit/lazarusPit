package August20;

public class yoPrimo {

    /*
    *     A prime number has 2 factors: 1 & itself
    *     A composite number has more than 2 factors
    *
    * */


    // previous method
    // iterate from the number to 1, if the modulus operation ==0 , add 1 to a counter
    // check the counter
    // if the counter is greater than 2, the number is not prime

    static void siPrimoM1(int input){
        int counter = 0;
      for(int i=input;i>0;i--){
          if(input%i==0){counter++;}
      }
        if(counter==2){
            System.out.println(input + " iz prime");
        }
        else System.out.println(input + " iz composite");

    }


    // optimized, less iterations
    // iterate from 2 to number-1
    // not using 1 or the number itself
    // so the counter should be 0

    static void siPrimoM2(int input){
        int counter = 0;
        for(int i=2;i<input;i++){
            if(input%i==0){counter++;}
        }
        if(counter!=0){
            System.out.println(input + " iz composite");
        }
        else System.out.println(input + " iz prime");
    }

    public static void main(String[] args) {
    siPrimoM1(2);
    siPrimoM1(3);
    siPrimoM1(4);
    siPrimoM1(5);
    siPrimoM1(6);
    siPrimoM1(7);
    siPrimoM1(24);
        System.out.println();
        siPrimoM2(2);
        siPrimoM2(3);
        siPrimoM2(4);
        siPrimoM2(5);
        siPrimoM2(6);
        siPrimoM2(7);
        siPrimoM2(24);
    }

}
