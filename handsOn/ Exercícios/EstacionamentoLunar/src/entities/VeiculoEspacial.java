package entities;

public class VeiculoEspacial extends Veiculo{
  public int numeroMotores;
  public Piloto piloto;

  public VeiculoEspacial(String nome, int anoFabricacao, Piloto piloto, int numeroMotores) {
    super(nome, anoFabricacao);
    this.numeroMotores = numeroMotores;
    this.piloto = piloto;
  }
}
