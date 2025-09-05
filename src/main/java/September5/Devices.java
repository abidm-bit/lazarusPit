package September5;

import java.awt.*;
import java.util.ArrayList;

class Devices {

    protected static ArrayList<String> using = new ArrayList<>();

    public Devices(String deviceName){
        using.add(deviceName);
    }

    public static void getDevice(int index){
        System.out.println(using.get(index));
    }

    public static void main(String[] args) throws IndexOutOfBoundsException{
    try {
        new Office();
        new BedRoom();
        new LivingRoom();
        getDevice(5);
        getDevice(2);
        getDevice(7);
        getDevice(9);
    }
    catch (IndexOutOfBoundsException ioobe){
        System.out.println("that index doesn't exist");
    }

    }

}

class Office{
    public Office(){

        new Devices("Massage gun");
        new Devices("Xbox controller");
        new Devices("One by Wacom");
    }
}

class BedRoom{
    public BedRoom(){
        new Devices("Arduino Tripwire");
        new Devices("Airpods");
    }
}

class LivingRoom{
    public LivingRoom(){
        new Devices("K400 Keyboard");
        new Devices("Bluetoof device has connected");
        new Devices("Roomba");
    }
}