package entities;

import java.util.HashSet;

public class NaveTuristica extends VeiculoEspacial{
  public HashSet<Turista> passageiros;

  public NaveTuristica(String nome, int anoFabricacao, Piloto piloto, int numeroMotores) {
    super(nome, anoFabricacao, piloto, numeroMotores);
    this.passageiros = new HashSet<Turista>();
  }


}
