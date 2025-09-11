package September11;

public class Pizza {


    Pizza(boolean pan){
        if(pan){
            System.out.println("Cheese pizza with stuffed crust");
        }
        else{
            System.out.println("Deep dish pizza");
        }
    }

    Pizza(boolean pan, boolean vegetables){
        if(pan && vegetables){
            System.out.println("Cheese pizza with stuffed crust, jalapenos & green peppers");
        }
        else{
            System.out.println("Deep dish pizza with green peppers");
        }
    }

}

class LackToes{
    public static void main(String[] args) {
        System.out.println("When in New York: ");
        new Pizza(true);
        System.out.println(" OR ");
        new Pizza(true,true);
        System.out.println();
        System.out.println("When in Chicago");
        new Pizza(false);
        System.out.println(" OR ");
        new Pizza(false,true);
    }
}