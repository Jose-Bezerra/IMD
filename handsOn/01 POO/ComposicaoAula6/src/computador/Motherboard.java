package computador;

public class Motherboard {
    private String chipset;

    public  Motherboard() {
        chipset = "Intel";
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }


    public String toString() {
        return "Motherboard: " +
                chipset ;
    }
}
