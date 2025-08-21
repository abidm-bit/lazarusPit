package August21;

public class LeetCode367 {
    // Is a number a perfect square
    // big o: space & time O(1)

    boolean yaPerfectSquare(int input){
        return (Math.pow(input,0.5)%1==0);
    }



    public static void main(String[] args) {
        LeetCode367 lc367 = new LeetCode367();
        System.out.println(lc367.yaPerfectSquare(25));
        System.out.println(lc367.yaPerfectSquare(9));
        System.out.println(lc367.yaPerfectSquare(27));


    }

}
