import java.awt.*;
import java.util.ArrayList;

public class Screen {
    ArrayList<Pixel> pixels = new ArrayList();
    Dimensions dimensions;
    String colorScreen;

    public Screen(int pixelsNumber, int width, int length, int depth) {
        this.dimensions = new Dimensions(width, length, depth);
        setArrayList(pixelsNumber);
    }

    public void setArrayList(int pixelsNumber){
        for (int i = 0; i < pixelsNumber; i++){
            this.pixels.add(new Pixel());
        }
    }

    public void setPixel(int indexPixel, String color) {
        this.pixels.get(indexPixel).setPixel(color);
    }

    public void colorScreen(String colorScreen) {
        this.colorScreen = colorScreen;
        System.out.println("Color screen: " + this.colorScreen);
    }

    public String toString() {
        return dimensions.toString() + pixels.toString() + "\n";
    }


}
