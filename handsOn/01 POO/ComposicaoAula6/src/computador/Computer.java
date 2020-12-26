package computador;

public class Computer {
    private Motherboard systemBoard;
    private Memory memoria;
    private Display monitor;

    public Computer(){
        systemBoard = new Motherboard();
    }

    public Motherboard getSystemBoard() {
        return systemBoard;
    }

    public void setSystemBoard(Motherboard systemBoard) {
        this.systemBoard = systemBoard;
    }

    public Memory getMemoria() {
        return memoria;
    }

    public void setMemoria(Memory memoria) {
        this.memoria = memoria;
    }

    public Display getMonitor() {
        return monitor;
    }

    public void setMonitor(Display monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{";
    }
}
