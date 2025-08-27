package August27;

public class TheEmbroideryMachine {
    public static void main(String[] args) {

    // instead of creating an object per thread , i can use a for loop

        for(int i=1;i<5;i++){
            TheMultiThreadThing tmt = new TheMultiThreadThing(i);
            tmt.start();
        }
 /*  4 threads:
        Tire #1 lefty loosie
        Tire #4 lefty loosie
        Tire #2 lefty loosie
        Tire #3 lefty loosie
        Tire #4 righty tighty
        Tire #2 righty tighty
        Tire #1 righty tighty
        Tire #3 righty tighty


  */
    }

}
