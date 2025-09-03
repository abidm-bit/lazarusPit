package September3;

public class MemoryManagement {

    public void method1(){
        int x = 93;
        System.out.println(x);
    }

   public void method2(){
        int y = 94;
        System.out.println(y);
    }

    public void method3(){
        int z = 95;
        System.out.println(z);
    }

    public static void main(String[] args) {

        MemoryManagement mm = new MemoryManagement();
        mm.method1();
        mm.method2();
        mm.method3();

    }

}

