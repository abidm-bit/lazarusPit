package September3.v2;

// hierarchical inheritance

// top level class
public class CarParts {
    String chassis;
    String engine;
    String wheelSize;
    void printCarInfo(){
        System.out.println(chassis + " " + engine + " " + wheelSize);
    }
}

// multiple derived classes from the top level class
class NissanRogue extends CarParts{
    void NR() {
        this.chassis="SUV";
        this.engine="4 Cylinder Turbo";
        this.wheelSize="23";
        printCarInfo();
    }
}

class NissanMaxima extends CarParts{
    void NM(){
        this.chassis="Sedan";
        this.engine="V6";
        this.wheelSize="18";
        printCarInfo();
    }
}

class HondaCivic extends CarParts{
    void HC(){
        this.chassis="Sedan";
        this.engine="4 Cylinder";
        this.wheelSize="19";
        printCarInfo();
    }
}

class TrackStar{
    public static void main(String[] args) {
        NissanRogue nissanRogue = new NissanRogue();
        nissanRogue.NR();
        NissanMaxima nissanMaxima = new NissanMaxima();
        nissanMaxima.NM();
        HondaCivic hondaCivic = new HondaCivic();
        hondaCivic.HC();
    }
}