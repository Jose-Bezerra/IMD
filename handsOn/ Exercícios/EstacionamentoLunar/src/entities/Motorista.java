package entities;

public class Motorista  extends Pessoa{
  public int carteira;

  public Motorista(String nome, int carteira) {
    super(nome);
    this.carteira = carteira;
  }
}
