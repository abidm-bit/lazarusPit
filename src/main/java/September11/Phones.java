package September11;

abstract class Phones {
    public void purpose(){
        System.out.println("I make calls, texts and can browse the internet");
    }
}

class iPhone extends Phones{
String name = "I'm an iPhone";
String os = "I was designed by Apple in California & I run on iOS";
    @Override
    public void purpose() {
        System.out.println(this.name);
        super.purpose();
        System.out.println(this.os);
    }
    iPhone(){
        purpose();
    }
}

class Pixel extends Phones{
    String name = "I'm a Pixel";
    String os = "I was designed by Google in California and I run on Android";

    @Override
    public void purpose() {
        System.out.println(this.name);
        super.purpose();
        System.out.println(this.os);
    }
    Pixel(){
        purpose();
    }
}


class Mobile{
    public static void main(String[] args) {
        new iPhone();
        System.out.println();
        new Pixel();
    }
}