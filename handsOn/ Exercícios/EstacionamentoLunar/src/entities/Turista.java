package entities;

public class Turista extends Pessoa {
  public int passaporte;

  public Turista(String nome, int passaporte){
    super(nome);
    this.passaporte = passaporte;
  }
}
