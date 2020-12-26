package computador;

public class Display {
    private String resolution;

    public Display() {
        resolution = "1280 x 720 pixels";
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
