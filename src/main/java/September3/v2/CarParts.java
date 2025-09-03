package September3.v2;

// hierarchical inheritance

// top level class
public class CarParts {
    String chassis;
    String engine;
    String wheelSize;
}

// multiple derived classes from the top level class
class NissanRogue extends CarParts{
    void NR() {
        this.chassis="SUV";
        this.engine="4 Cylinder Turbo";
        this.wheelSize="23";
    }
}

class NissanMaxima extends CarParts{
    void NR(){
        this.chassis="Sedan";
        this.engine="V6";
        this.wheelSize="18";
    }
}

class HondaCivic extends CarParts{
    void HC(){
        this.chassis="Sedan";
        this.engine="4 Cylinder";
        this.wheelSize="19";
    }
}