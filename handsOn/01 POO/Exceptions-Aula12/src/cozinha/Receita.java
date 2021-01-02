package cozinha;

import java.util.HashMap;

public class Receita {
  private String nome;
  //String: Nome do ingrediente, Float: quantidade necessária>
  private HashMap<String, Float> ingredientes;

  public Receita(String nome) {
    ingredientes = new HashMap<String, Float>();
    this.nome = nome;
  }

  public void AdicionarIngrediente(String nome, Float quantidade) throws QuantidadeException, Exception {
    if (quantidade <= 0) {
      throw new QuantidadeException("Quantidade de " + nome + " deve ser maio que 0.");
    }

    if (ingredientes.containsKey(nome)) {
      throw new Exception("Ingrediente já adicionado na receita");
    }
    this.ingredientes.put(nome, quantidade);
  }

  public String getNome(){
    return nome;
  }

  public HashMap<String, Float> getIngredientes(){
    return ingredientes;
  }

}
