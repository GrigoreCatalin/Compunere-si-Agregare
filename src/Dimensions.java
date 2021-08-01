public class Dimensions {
    private final int width;
    private final int length;
    private final int depth;

    public Dimensions(int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public String toString() {
        String result = "Width phone: " + this.width + "\n" + "Length phone: " + this.length + "\n" + "Depth phone: " + this.depth + "\n";
        return result;
    }
}
