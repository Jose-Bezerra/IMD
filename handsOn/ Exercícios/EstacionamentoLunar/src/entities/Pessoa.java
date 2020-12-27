package entities;

public class Pessoa {
  public String nome;
  public int idade;
  private float creditos;

  public Pessoa(String nome) {
    this.nome = nome;
    this.creditos = 1000;
  }
  public void pagar(float valor){
    System.out.println(this.nome + " pagando "+ valor);
    this.creditos -= valor;
  }
}
