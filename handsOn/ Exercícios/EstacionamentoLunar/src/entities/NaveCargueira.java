package entities;

public class NaveCargueira extends VeiculoEspacial {
  public int capacidadeMaxima;

  public NaveCargueira(String nome, int anoFabricacao, Piloto piloto, int numeroMotores, int capacidadeMaxima) {
    super(nome, anoFabricacao, piloto, numeroMotores);
    this.capacidadeMaxima = capacidadeMaxima;
  }
}
