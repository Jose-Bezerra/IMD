package entitities.oficina;

import java.util.ArrayList;

public class Componente {
  String nome;
  ArrayList<Peca> peca;

  public Componente(String nome, ArrayList<Peca> peca) {
    this.nome = nome;
    this.peca = peca;
  }

  @Override
  public String toString() {
    return "Componente{" +
        "nome='" + nome + '\'' +
        ", peca=" + peca +
        '}';
  }
}
