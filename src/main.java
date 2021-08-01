public class main {
    public static void main(String[] args) {

        Smartphone iphone = new Smartphone(5, 10, 20, 16, 100, 12, 100, 54);
        iphone.setPixel(1, "Blue");
        iphone.setPixel(2, "Black");
        iphone.setPixel(3, "Red");
        iphone.setPixel(4, "Magenta");
        System.out.println(iphone.toString());
        iphone.colorScreen("White" + "\n");

        iphone.pressVolumeDown();
        System.out.println(iphone.toString() + "\n");

        iphone.pressVolumeUp();
        iphone.pressVolumeUp();
        System.out.println(iphone.toString() + "\n");

        iphone.muteMicrophone();
        iphone.setSilenceMode();

    }
}
