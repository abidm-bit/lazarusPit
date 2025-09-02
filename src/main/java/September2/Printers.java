package September2;

public class Printers {
    public static void main(String[] args) {

        System.out.println("Printing in fast draft, so this won't be in order");

    for(int i=1;i<=3;i++){
        for(int e =1 ; e<=7; e++){
            Printer printer = new Printer(i,e);
            printer.start();
            // works independently at once, no guarantee which thread will run
        }
    }


    }
}

class Printer extends Thread{

    private int printerNumber;
    private int pagesToPrint;

    public Printer(int printerNumber,int pagesToPrint){
        this.printerNumber=printerNumber;
        this.pagesToPrint=pagesToPrint;
    }

    @Override
    public void run() {
        for(int pages=1;pages<=pagesToPrint;pages++){
        System.out.println("printer # "+this.printerNumber + " is printing page # " + pages);}
    }

}


