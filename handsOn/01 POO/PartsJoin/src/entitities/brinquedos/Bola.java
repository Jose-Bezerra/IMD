package entitities.brinquedos;

public class Bola extends Brinquedos {
  private String esporte;

  public Bola(String cor, String material, String esporte) {
    super(cor, material);
    this.esporte = esporte;
  }

  public String getEsporte() {
    return esporte;
  }

  public void setEsporte(String esporte) {
    this.esporte = esporte;
  }

  public void exibirRelatorio() {
    System.out.println(super.material);
    System.out.println(super.getCor());
  }

  @Override
  public String toString() {
    return "entitities.brinquedos.Bola{" +
        "esporte='" + esporte + '\'' +
        ", material='" + material + '\'' +
        '}';
  }

  public static void main(String[] args) {
    Bola volei = new Bola("Verde", "Couro", "Vôlei");
    volei.setCor("Azul");
    volei.material = "Plástico";
    System.out.println(volei);

  }

}
