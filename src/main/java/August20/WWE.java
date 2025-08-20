package August20;

import java.util.Random;

public class WWE {

static void referee(){
    Random random = new Random();
    switch( random.nextInt(3)){
        case(0)->{
            System.out.println("1!");
        }
        case (1)->{
            System.out.println("1! ... 2!");
        }
        case(2)->{
            System.out.println("1! ... 2! ... 3! ... PINFALL!!!");
        }
    }
}


    public static void main(String[] args) {
for(int i = 0; i <=5;i++){
    referee();
}
    }
}
