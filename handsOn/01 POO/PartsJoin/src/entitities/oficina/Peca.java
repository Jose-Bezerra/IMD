package entitities.oficina;

public class Peca {
  private String tipo;
  private String peso;
  private String material;

  public Peca(String tipo, String peso, String material) {
    this.tipo = tipo;
    this.peso = peso;
    this.material = material;
  }

  @Override
  public String toString() {
    return "Peca{" +
        "tipo='" + tipo + '\'' +
        ", peso='" + peso + '\'' +
        ", material='" + material + '\'' +
        '}';
  }
}
