package sobrecarga;

public class Toys {
  private String name;
  private double velocity;
  private double speed_up;

  public Toys(){};

  public Toys(String name){
    this.name = name;
  }

  public Toys(double velocity) {
    this.velocity = velocity;
  }
  public Toys(int velocity) {
    this.velocity = velocity;
  }
  public Toys(float velocity, double speed_up) {
    this.velocity = velocity;
    this.speed_up = speed_up;
  }

  public void mover() {
    System.out.println("Carro entrando em movimento!");
  }

  public static void main(String[] args) {
    Toys ball = new Toys("Bola de futebol");
    System.out.println(ball.name);
  }


}
