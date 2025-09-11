package September11;


import java.util.Objects;

enum draw{
    LINE_ART,
    GRAFFITI,
    GRAPHIC_DESIGN
}
enum mediums{
    WALLS,
    PAPER,
    PIXELMATOR
}
class Art{

    Art(String artType,String medium){
        if(artType.equals(draw.GRAFFITI.name())){
            System.out.println("I'm writing " + artType + " on " + medium);
        }
        else {
            System.out.println("I'm drawing " + artType + " on " + medium);
        }
    }

    Art(boolean digitalArt,String artType){
       if(digitalArt && Objects.equals(artType, draw.GRAFFITI.name()))
       { System.out.println("I'm drawing " + artType + " in " + mediums.PIXELMATOR.name());}
       else if (digitalArt && artType.equals(draw.GRAPHIC_DESIGN.name())) {
           System.out.println("I'm designing graphics using " + mediums.PIXELMATOR.name());
       } else {
           System.out.println("I'm writing " + artType + " in " +  mediums.PIXELMATOR.name());
       }
    }

}

public class OverLoadedConstructors {

    public static void main(String[] args) {

            new Art(draw.GRAFFITI.name(), mediums.WALLS.name());

            System.out.println();

            new Art(draw.LINE_ART.name(), mediums.PAPER.name());

            System.out.println();

            new Art(true,draw.LINE_ART.name());

            System.out.println();

            new Art(true,draw.GRAFFITI.name());

            System.out.println();

            new Art(true,draw.GRAPHIC_DESIGN.name());
    }

}