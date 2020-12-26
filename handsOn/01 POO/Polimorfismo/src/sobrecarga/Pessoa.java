package sobrecarga;

/**
 * Nesta classe fazemos uso do polimorfismo de sobrecarga.
 * Tenha em mente que a conversão de tipos se parece com polimorfismo.
 * */
public class Pessoa {
  private int rg;
  private String nome;

  public Pessoa(){};

  public Pessoa(String nome){
    this.nome = nome;
  };
  public Pessoa(int rg, String nome){
    this.rg = rg;
    this.nome = nome;
  };

}
