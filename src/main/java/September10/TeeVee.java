package September10;


// Super class (Parent class)
public class TeeVee {
    public String channel;
    public int channelNumber;
    public String dayOfTheWeek;

    // to be used
    public void channelGuide(){
        System.out.println("It's "+ dayOfTheWeek);
        System.out.println("You're watching " + channel + " on channel # " + channelNumber);
    }

}

class PBS extends TeeVee{
    @Override
    public void channelGuide() {
        // before the super implementation, setting the values
        this.channel="PBS Kids";
        this.channelNumber=13;
        this.dayOfTheWeek="Wednesday";
        super.channelGuide();
        System.out.println("**DRUMS** EVERYDAY WHEN YOU'RE WALKING DOWN THE STREET ... ");
    }
}

class Disknee extends TeeVee{
    @Override
    public void channelGuide() {
        this.channel="Disney";
        this.channelNumber=31;
        this.dayOfTheWeek="Friday";
        super.channelGuide();
        System.out.println("And now a Disney feature film");
    }
}


class Panasonic{
    public static void main(String[] args) {
        PBS pbs = new PBS();
        pbs.channelGuide();
        System.out.println();
        Disknee dsn = new Disknee();
        dsn.channelGuide();
        System.out.println();

    }
}



