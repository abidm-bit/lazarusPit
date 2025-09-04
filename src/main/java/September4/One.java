package September4;

// handle multiple interfaces with the same default method
// super

interface Ay{
    default void printer(){
        System.out.println("I want to play Sifu");
    }
}

interface Bee{
    default void printer(){
        System.out.println("I want to play UFC");
    }
}


class Two implements Ay,Bee{
    @Override
    public void printer() {
        Bee.super.printer();
    }
}

class One implements Ay,Bee{

    @Override
    public void printer() {
        Ay.super.printer();
    }


    public static void main(String[] args) {
    One one = new One();
    one.printer(); // I chose Ay.super.printer()  == "I want to play Sifu"

        System.out.println();

    Two two = new Two();
    two.printer(); // I chose Bee.super.printer() == "I want to play UFC"

    }


}

