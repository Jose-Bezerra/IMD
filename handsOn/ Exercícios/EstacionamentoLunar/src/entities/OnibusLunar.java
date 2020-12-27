package entities;

import java.util.HashSet;

public class OnibusLunar extends VeiculoDeSolo {
  public HashSet<Pessoa> passageiros;

  public OnibusLunar(String nome, int anoFabricacao, Motorista motorista, int numDePneus) {
    super(nome, anoFabricacao, motorista, numDePneus);
    this.passageiros = new HashSet<Pessoa>();
  }
}
