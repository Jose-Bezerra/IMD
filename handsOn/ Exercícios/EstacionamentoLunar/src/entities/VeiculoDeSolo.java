package entities;

public class VeiculoDeSolo extends Veiculo{
  public int numDePneus;
  public Motorista motorista;

  public VeiculoDeSolo(String nome, int anoFabricacao, Motorista motorista, int numDePneus){
    super(nome, anoFabricacao);
    this.numDePneus = numDePneus;
    this.motorista = motorista;
  }

}
