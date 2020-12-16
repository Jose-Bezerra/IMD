package fabrica;

public class Carro {
  String tipo;
  String cor;
  String placa;
  int numPortas;

  /* Adicionando construtores */
  public Carro(String tipo, String cor,  String placa, int numPortas) {
    this.tipo =tipo;
    this.cor = cor;
    this.placa = placa;
    this.numPortas = numPortas;
  }

  /* Adicionando um segundo construtor */

  public Carro() {
    System.out.println("Você instanciou um novo objeto carro.");
  }

  /* adicionando métodos
   * Observe o padrão Get e Set
   * A palavra reservada this faz referência ao atributo da classe e não ao parâmetro que etá com mesmo nome. */

  public String getCor() {
    return cor;
  }

  public void setCor(String  cor) {
    this.cor = cor;
  }

  public String tipo() {
    return tipo;
  }

  public void setTipo( String tipo){
    this.tipo = tipo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca( String placa){
    this.placa = placa;
  }

  public int getNumPortas() {
    return numPortas;
  }

  public void setNumPortas( int numPortas){
    this.numPortas = numPortas;
  }

}
