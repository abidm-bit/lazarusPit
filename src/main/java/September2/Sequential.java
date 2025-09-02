package September2;

public class Sequential {

    private static void Printer1(){
        for(int i=1;i<=5;i++){
            System.out.println("Printer 1 is printing page " + i);
        }
    }

    private static void Printer2(){
        for(int e=1;e<=3;e++){
            System.out.println("Printer 2 is printing page " + e);
        }
    }


    public static void main(String[] args) {
        Printer1();
        Printer2();
    }
}
