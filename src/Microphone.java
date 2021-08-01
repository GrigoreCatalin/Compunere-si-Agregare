public class Microphone {
    int maxVolumeMicrophone;
    int crtVolumeMicrophone;

    public Microphone(int maxVolumeMicrophone) {
        this.maxVolumeMicrophone = maxVolumeMicrophone;
        this.crtVolumeMicrophone = 1 / 4 * this.maxVolumeMicrophone;
    }

    public Microphone(int maxVolumeMicrophone, int crtVolumeMicrophone) {
        this.maxVolumeMicrophone = maxVolumeMicrophone;
        this.crtVolumeMicrophone = crtVolumeMicrophone;
    }

    public boolean increaseVolume() {
        if (this.crtVolumeMicrophone < this.maxVolumeMicrophone) {
            crtVolumeMicrophone++;
            return true;
        } else {
            return false;
        }
    }

    public boolean decreaseVolume() {
        if (this.crtVolumeMicrophone > 0) {
            crtVolumeMicrophone--;
            return true;
        } else {
            return false;
        }
    }

    public void muteMicrophone() {
        this.crtVolumeMicrophone = 0;
        System.out.println("Mute microphone");
    }

    public String toString() {
        String result = "Volume maximum microphone: " + this.maxVolumeMicrophone + "\n" + "Volume current microphone: " + this.crtVolumeMicrophone;
        return result;
    }

}
