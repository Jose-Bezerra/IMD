package entities;

public class Piloto extends Pessoa{
  public int licenca;

  public Piloto(String nome, int licenca){
    super(nome);
    this.licenca = licenca;
  }
}
