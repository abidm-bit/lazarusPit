package July21;

import java.util.Arrays;
import java.util.EnumMap;

enum HAAGENDAAZ {
 CHOCOLATE, ALMOND_CHOCOLATE
}

enum BENNJERRYS{
 ICE_CREAM_SANDWICH, STRAWBERRY
}

enum FROZADE{
 STRAWBERRY_DAQUIRI,LEMONADE
}

class frozadeCart {

 void iceCream(Enum<?> flavor) {
  System.out.println("I would like " + flavor.name());
 }

}

class JavitsCenter {

 public static void main(String[] args) {
//  System.out.println( HAAGENDAAZ.ALMOND_CHOCOLATE);         // ALMOND_CHOCOLATE
//  System.out.println(Arrays.toString(HAAGENDAAZ.values())); // [CHOCOLATE, ALMOND_CHOCOLATE]
  frozadeCart cart = new frozadeCart();
  cart.iceCream(FROZADE.LEMONADE);
  cart.iceCream(HAAGENDAAZ.ALMOND_CHOCOLATE);
 }


}