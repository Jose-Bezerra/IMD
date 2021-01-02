package utils;

public class RelogioPonto {
  // Iremos criar três atributos que não pertencem ao objeto, mas à classe devido serem comuns a qualquer objeto criado. Não confunda estático com constante.

  public static  int hora;
  public static  int minuto;
  public static int segundos;

  private int id;
  private String nomeFilial;

  // Criando os construtores
  public RelogioPonto(){}

  public RelogioPonto(int id, String nomeFilial) {
    this.id = id;
    this.nomeFilial = nomeFilial;
  }

  public static int getHora() {
    return hora;
  }

  public static void setHora(int hora) {
    RelogioPonto.hora = hora;
  }

  public static int getMinuto() {
    return minuto;
  }

  public static void setMinuto(int minuto) {
    RelogioPonto.minuto = minuto;
  }

  public static int getSegundos() {
    return segundos;
  }

  public static void setSegundos(int segundos) {
    RelogioPonto.segundos = segundos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNomeFilial() {
    return nomeFilial;
  }

  public void setNomeFilial(String nomeFilial) {
    this.nomeFilial = nomeFilial;
  }
}
