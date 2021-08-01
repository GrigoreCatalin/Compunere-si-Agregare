public class Smartphone {
    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;


    public Smartphone(int pixelsNumber, int width, int length, int depth, int maxVolume,
                      int maxVolumeMicrophone) {
        this.theScreen = new Screen(pixelsNumber, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(maxVolume);
        this.theMicrophone = new Microphone(maxVolumeMicrophone);
    }

    public Smartphone(int pixelsNumber, int width, int length, int depth, int maxVolume,
                      int crtVolume, int maxVolumeMicrophone, int crtVolumeMicrophone) {
        this.theScreen = new Screen(pixelsNumber, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(maxVolume, crtVolume);
        this.theMicrophone = new Microphone(maxVolumeMicrophone, crtVolumeMicrophone);
    }

    public void pressVolumeUp(){
        this.theCase.pressVolumeUp();
        this.theSpeaker.increaseVolume();
    }

    public void pressVolumeDown(){
        this.theCase.pressVolumeDown();
        this.theSpeaker.decreaseVolume();
    }

    public void setPixel(int indexPixel, String colorPixel){
        this.theScreen.setPixel(indexPixel, colorPixel);
    }

    public void colorScreen (String colorScreen){
        this.theScreen.colorScreen(colorScreen);
    }

    public void increaseMicrophoneVolume(){
        this.theMicrophone.increaseVolume();
    }

    public void decreaseMicrophoneVolume(){
        this.theMicrophone.decreaseVolume();
    }

    public void muteMicrophone(){
        this.theMicrophone.muteMicrophone();
    }

    public void setSilenceMode(){
        this.theSpeaker.setSilenceMode();
    }

    public String toString(){
        return theScreen.toString() + theSpeaker.toString() + theMicrophone.toString();
    }



}
