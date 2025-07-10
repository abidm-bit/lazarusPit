package July10;

public class Reverse {
    public static void main(String[] args) {
        reversem2("good job you found me");
        System.out.println();
        reversem1("henny con cranberry");
    }

    static void reversem1(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    static void reversem2(String str) {
        for(int i = str.length() - 1; i >= 0; i--) {
            System.out.print((str.charAt(i)));
        }
    }

}
