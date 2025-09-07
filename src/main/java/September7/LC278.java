package September7;

public class LC278 {



    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    //eg
    static boolean isBadVersion(int x){
        return x%2==0;
    }

    public int firstBadVersion(int n) {
        for(int i=1;i<=n;i++)
            if(isBadVersion(i)){return i; }
        return n-1;
    }


    // cuando n = 2126753390 , runtime error
    // solution runs upto the 11th test case,
    // entonces leetcode problem no bueno


}










