package September10;

public interface Breakfast {
    String food();
    String drink();
}

abstract class BusName{
   String name(){
       return "Breakfus from ";
   };
}

class Dunkin extends BusName implements Breakfast{

    // i'll use the abstract class implementation & I can add on to it
    @Override
    String name() {
        return super.name() + " Dunkin Donuts :";
    }

    // implementing the interface's properties & setting the values
    @Override
    public String food() {
        return "Everything Bagel";
    }

    @Override
    public String drink() {
        return "Coffee";
    }

    // referring to the values set in this class, this is the Constructor
    Dunkin(){
        System.out.println(this.name() + this.food() + " & a " + this.drink());
    }


}

class Mcdees extends BusName implements Breakfast{

    @Override
    String name() {
        return super.name() + " McDonalds : ";
    }

    @Override
    public String food() {
        return "Pancakes, hashbrowns";
    }

    @Override
    public String drink() {
        return "Apple juice";
    }
    Mcdees(){
        System.out.println(this.name() + this.food() + " & an " + this.drink());
    }


}



class fmotd{
    public static void main(String[] args) {
        new Dunkin();
        System.out.println();
        new Mcdees();
    }
}