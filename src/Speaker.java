public class Speaker {
    int maxVolume;
    int crtVolume;

    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = 1 / 4 * this.maxVolume;
    }

    public Speaker(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    public boolean increaseVolume() {
        if (this.crtVolume < this.maxVolume) {
            crtVolume++;
            return true;
        } else {
            return false;
        }
    }

    public boolean decreaseVolume() {
        if (this.crtVolume > 0) {
            crtVolume--;
            return true;
        } else {
            return false;
        }
    }

    public void setSilenceMode() {
        this.crtVolume = 0;
        System.out.println("Silent Mode");
    }

    public String toString() {
        String result = "Volume maximum speaker: " + this.maxVolume + "\n" + "Volume current speaker: " + this.crtVolume + "\n";
        return result;
    }
}
