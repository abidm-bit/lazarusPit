package September3.v2;

public class Family {

    // Multilevel Inheritance

    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        Father f = new Father();
        Son s = new Son();
        System.out.println("The grandfather has a "+ gf.watch);
        System.out.println("The father has " + f.watches);
        System.out.println("The son has " + s.watches2);

    }
}


class Grandfather{
    String watch = "Rolex Skydweller";
}

class Father extends Grandfather {
    String fwatch = "Tudor Baywatch";
    String watches = "his dad's "+watch + " & his own " + fwatch;
}

class Son extends Father {
    String swatch = "Moonswatch";
    String watches2 = "his grandfather's "+watch + ", his dad's "+ fwatch + " and his own " + swatch;
}