package September1;

public class LC67 {

    /*      count binary
        // 01
            0 * 2^1 + 1 * 2^0    == 1
        // 11
            1 * 2^1 + 1 * 2^0    == 3

            1+3 ==4 == 100
    */

static String addBinary(String a,String b){
    String [] processA = a.split("");
    String [] processB = b.split("");
    double sumA=0.0;
    double sumB=0.0;
    for(int i= processA.length-1;i>=0;i--){
        sumA += (Math.pow(2, i) * Double.parseDouble(processA[processA.length - 1 - i]));


    }
    for(int e= processB.length-1;e>=0;e--){
        sumB += (Math.pow(2, e) * Double.parseDouble(processA[processA.length - 1 - e]));

        // previous incorrect logic to parse thru the String
//        sumB += (2* Math.pow(Double.parseDouble(processB[e]),e));
    }

    int answer = (int) (sumA+sumB);

    //    This is the sum, which is correct
    //    return String.valueOf(sumA+sumB);

    // but i have to convert it back to binary
    return  Integer.toBinaryString(answer);
}



    public static void main(String[] args) {
        // Test Case 1 : "11" , "1" , expected "100"
        System.out.println(addBinary("11","1"));

        // Test Case 2 : "1010","1011" , expected  "10101"
        System.out.println(addBinary("1010","1011"));

    }


}
