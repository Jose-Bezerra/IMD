package fabrica;

public class Carro {
  String tipo;
  String cor;
  String placa;
  int numPortas;
  Pessoa dono;
  int cambio;

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

  void ligar(){
    System.out.println("Carro ligado.");
  }

  void desligar(){
    System.out.println("Carro desligado");
  }

  void acelerar(){
    System.out.println("Carro acelerando!");
  }

  void frear(){
    System.out.println("Carro frenando!");
  }

  public int getCambio(){
    return  cambio;
  }

  public void setCambio(int cambio){
    this.cambio = cambio;
  }
  /* adicionando métodos
   * Observe o padrão Get e Set
   * A palavra reservada this faz referência ao atributo da classe e não ao parâmetro que etá com mesmo nome. */

  public Pessoa getDono(){
    return dono;
  }

  public void setDono(Pessoa dono){
    this.dono = dono;
  }

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
