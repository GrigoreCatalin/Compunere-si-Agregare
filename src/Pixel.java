public class Pixel {
    String colorPixel;

    public Pixel() {
        this.colorPixel = "White";
    }

    public Pixel(String colorPixel) {
        this.colorPixel = colorPixel;
    }

    public void setPixel(String colorPixel) {
        this.colorPixel = colorPixel;
    }

    public String toString(){
       String result = colorPixel;
       return result;
    }

}
