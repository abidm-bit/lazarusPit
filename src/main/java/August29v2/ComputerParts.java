package August29v2;


public interface ComputerParts {

default void whatComputer(String comp){
    System.out.println("The computer is a: " + comp);
}

default void whatCPU(String cpu){
    System.out.println("This computer has a " + cpu + " CPU");
}

default void whatGPU(String gpu){
    System.out.println("This computer has a "+ gpu+ " GPU ");
}

}

class Computer implements ComputerParts{
    @Override
    public void whatComputer(String comp) {
        ComputerParts.super.whatComputer(comp);
    }

    @Override
    public void whatGPU(String gpu) {
        ComputerParts.super.whatGPU(gpu);
    }

    @Override
    public void whatCPU(String cpu) {
        ComputerParts.super.whatCPU(cpu);
    }
}

class Run{
    public static void main(String[] args) {

        Computer di = new Computer();
        di.whatComputer("Dell Inspiron");
        di.whatCPU("Intel Core 2 Duo");
        di.whatGPU("integrated, no discrete");

        System.out.println();

        Computer hpe = new Computer();
        hpe.whatComputer("HP Elitebook");
        hpe.whatCPU("Intel i5");
        hpe.whatGPU("integrated, no discrete");

        System.out.println();

        Computer mbp10 = new Computer();
        mbp10.whatComputer("2010 MacBook Pro");
        mbp10.whatCPU("Intel Core 2 Duo");
        mbp10.whatGPU("Nvidia GeForce 5400");

        System.out.println();

        Computer mba22 = new Computer();
        mba22.whatComputer("2022 MacBook Air");
        mba22.whatCPU("M1 Chip");
        mba22.whatGPU("integrated, no discrete");

    }
}