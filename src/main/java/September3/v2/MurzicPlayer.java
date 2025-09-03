package September3.v2;

// Reusable values set in an enum
enum Brand{SONY,APPLE}
enum Storage{CASSETTES,CDS,FLASH}
enum Power{BATTERIES,RECHARGEABLE}


// Top level interface
public interface MurzicPlayer {
    String name();
    String storage();
    String batteryType();
    default void mp(){
        System.out.println(name());
        System.out.println(storage());
        System.out.println(batteryType());
    }
}

// Two derived classes
class SW implements MurzicPlayer{

    @Override
    public String name() {
        return Brand.SONY.name() +" Walkman";
    }

    @Override
    public String storage() {
        return "Plays murzic using " + Storage.CDS.name();
    }

    @Override
    public String batteryType() {
        return Power.BATTERIES.name();
    }

    @Override
    public void mp() {
        MurzicPlayer.super.mp();
    }
}

class IPC implements MurzicPlayer{
    @Override
    public String name() {
        return Brand.APPLE.name()+" iPod Classic";
    }

    @Override
    public String storage() {
        return "Plays murzic using " + Storage.FLASH.name();
    }

    @Override
    public String batteryType() {
        return Power.RECHARGEABLE.name();
    }

    @Override
    public void mp() {
        MurzicPlayer.super.mp();
    }
}

class Bart{
    public static void main(String[] args) {
        SW sw = new SW();
        sw.mp();
        System.out.println();
        IPC ipc = new IPC();
        ipc.mp();

    }
}