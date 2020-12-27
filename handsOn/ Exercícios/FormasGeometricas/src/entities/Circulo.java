package entities;

public class Circulo extends Formas{
  private float raio;


  public Circulo(float raio) {
    this.raio = raio;
  }

  public float calcularArea() {
    return (float) Math.PI * raio * raio;
  }



  public float calcularPerimetro() {
    return (float) (2 * Math.PI * raio);
  }
}
