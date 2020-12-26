package entities;

public class Automovel extends Terrestre {
  private String cor;
  private int numPortas;
  private String placa;

  public Automovel(){
    super(5, 4);
  }

  public Automovel(int capacidade, int numRodas, String cor, int numPortas, String placa) {
    super(capacidade, numRodas);
    this.cor = cor;
    this.numPortas = numPortas;
    this.placa = placa;
  }

  
  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getNumPortas() {
    return numPortas;
  }

  public void setNumPortas(int numPortas) {
    this.numPortas = numPortas;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }


  public void imprimeDadosAutomovel(){
    System.out.println("Capacidade: " + capacidade);
    System.out.println("Num rodas: " + numRodas);
    System.out.println("Cor: " + cor);
  }

}
