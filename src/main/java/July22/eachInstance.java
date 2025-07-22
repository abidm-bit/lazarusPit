package July22;

interface qpl{
    default void operating(String name,boolean open){
        if (open) {
            System.out.println("the "+ name + " branch  is open");
        } else {
            System.out.println("the "+ name + " branch is not open");
        }
    }
}

class liberi implements qpl{
    @Override
    public void operating(String name, boolean open) {
        qpl.super.operating(name, open);
    }
}



public class eachInstance  {

    public static void main(String[] args) {
liberi l1 = new liberi();
liberi l2 = new liberi();
l1.operating("hollis",false);
l2.operating("floral park",true);
    }

}

