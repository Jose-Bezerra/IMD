public class Carro {
  String tipo;
  String cor;
  String placa;
  int numPortas;
  int cambio;
  Pessoa dono;

  //Criando novos construtores
  public Carro(){
    System.out.println("Você instanciou um novo carro!");
  }

  public Carro(String tipo, String cor, String placa, int numPortas) {
    this.tipo = tipo;
    this.cor = cor;
    this.placa = placa;
    this.numPortas = numPortas;
  }

  //Criamos os métodos para recuperar (GET) para recuperar os valores dos campos - atributos da classe e  atualizar (SET) os valores dos campos das classes.

  public String getTipo(){
    return tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getCor(){
    return cor;
  }

  public void setCor(String cor){
    this.cor = cor;
  }

  public String getPlaca(){
    return placa;
  }

  public void setPlaca(String placa){
    this.placa = placa;
  }

  public int numPortas(){
    return numPortas;
  }

  public void setNumPortas(int numPortas){
    this.numPortas = numPortas;
  }

  public int getCambio(){
    return cambio;
  }

  public void setCambio(int cambio){
    this.cambio = cambio;
  }

  public Pessoa getDono(){
    return dono;
  }

  public void setDono(Pessoa dono){
    this.dono = dono;
  }

  // Adicionando outros métodos para nossa classe Carro;

  void ligar(){
    System.out.println("Carro ligado!");
  }

  void desligar(){
    System.out.println("Carro desligado!");
  }

  void acelerar(){
    System.out.println("Acelerando o carro!");
  }

  void frear(){
    System.out.println("Freando o carro!");
  }



}
