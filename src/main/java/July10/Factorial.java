package July10;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(5)); // 120
        System.out.println(Factorial.factorial(6)); // 720

    }

    static int factorial(int n){
        int answer =1;
        while(n>0){
            answer*=n;
            n--;
        }
    return answer;
    }

}
