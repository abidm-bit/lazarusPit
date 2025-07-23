package July23;

enum Apple{
    Magic_Trackpad("https://www.apple.com/shop/product/MXK93AM/A/magic-trackpad-usb%E2%80%91c-white-multi-touch-surface"),
    Magic_Keyboard("https://www.apple.com/shop/product/MXCL3LL/A/magic-keyboard-usb-c-us-english"),
    Beats("https://www.apple.com/shop/accessories/all/headphones-speakers?f=beats&fh=47d1%2B3230");

    private final String url;

    Apple(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public static void productLink(String product){
        System.out.println(Apple.valueOf(product) + " " + Apple.valueOf(product).getUrl());
    }

}

public class AppleStore {

    public static void main(String[] args) {
        for(Apple apple : Apple.values()){
            Apple.productLink(apple.name());
        }
    }

}
