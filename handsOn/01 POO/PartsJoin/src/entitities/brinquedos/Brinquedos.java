package entitities.brinquedos;

public class Brinquedos {
  private String cor;
  protected String material;

  public Brinquedos (String cor, String material) {
    this.cor = cor;
    this.material = material;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }
}
