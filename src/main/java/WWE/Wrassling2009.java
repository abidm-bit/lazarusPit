package WWE;

import java.util.Random;

public class Wrassling2009 {
    public static void main(String[] args) {
        JC jc = new JC();
        BS bs = new BS();
        TH th = new TH();

        jc.referee();
        bs.referee();
        th.referee();

    }
}


interface Wrestler{
    String name();
    int wins();
    int losses();
}


interface RefereeLogic extends Wrestler {

    default void referee() {
        Random random = new Random();

        int totalMatches = wins() + losses();
        int percentW = (wins() * 100) / totalMatches;
        int percentL = 100 - percentW;

        int weightCase0 = percentL;
        int weightCase2 = percentW;
        int weightCase1 = (100 - Math.abs(percentW - percentL)) / 2;

        int total = weightCase0 + weightCase1 + weightCase2;
        int pick = random.nextInt(total);

        // Always start with "1!"
        System.out.print("Wrestler: " + name() + " -> Count: 1!");

        if (pick < weightCase0) {
            // stops at 1
        } else if (pick < weightCase0 + weightCase1) {
            System.out.print(" ... 2!");
        } else {
            System.out.print(" ... 2! ... 3! ... PINFALL!!!");
        }
        System.out.println();
    }
}

class JC implements RefereeLogic{

    @Override
    public String name() {
        return "John Cena";
    }

    @Override
    public int wins() {
        return 95;
    }

    @Override
    public int losses() {
        return 8;
    }
}

class BS implements RefereeLogic{

    @Override
    public String name() {
        return "Big Show";
    }

    @Override
    public int wins() {
        return 59;
    }

    @Override
    public int losses() {
        return 33;
    }
}

class TH implements RefereeLogic{

    @Override
    public String name() {
        return "Triple H";
    }

    @Override
    public int wins() {
        return 57;
    }

    @Override
    public int losses() {
        return 14;
    }
}