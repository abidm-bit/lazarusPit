package August10;

public class FileShare {
    public static void main(String[] args) {
    ThePirateBay tpb = new ThePirateBay();
        System.out.println(tpb.type());
        System.out.println(tpb.p2p());
        System.out.println();
        MegaUpload mu = new MegaUpload();
        System.out.println(mu.type());
        System.out.println(mu.p2p());
    }

}

interface FileSharing{
    String type();
    boolean p2p();
    boolean advertisements();
}

class ThePirateBay implements FileSharing{

    @Override
    public String type() {
        return "torrent site";
    }

    @Override
    public boolean p2p() {
        return true;
    }

    @Override
    public boolean advertisements() {
        return true;
    }
}

class MediaFire implements FileSharing{


    @Override
    public String type() {
        return "peer to peer";
    }

    @Override
    public boolean p2p() {
        return true;
    }

    @Override
    public boolean advertisements() {
        return false;
    }
}

class MegaUpload implements FileSharing{


    @Override
    public String type() {
        return "peer to peer";
    }

    @Override
    public boolean p2p() {
        return true;
    }

    @Override
    public boolean advertisements() {
        return false;
    }
}