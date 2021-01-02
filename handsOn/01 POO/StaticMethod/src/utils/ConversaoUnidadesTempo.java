package utils;

public class ConversaoUnidadesTempo {

  public static final int CONSTANTE_TEMPO = 60;

  //Horas -> Minutos
  public static float converteHorasParaMinutos(float horas) {
    return CONSTANTE_TEMPO * horas;
  }

  //Horas -> Segundos
  public static float converteHorasParaSegundos(float horas) {
    return CONSTANTE_TEMPO * CONSTANTE_TEMPO * horas;
  }

  //Minutos -> Horas
  public static float converteMinutosHoras(float minutos) {
    return minutos/CONSTANTE_TEMPO;
  }

  //Minutos -> Segundos
  public static float converteMinutosSegundos(float minutos) {
    return CONSTANTE_TEMPO * minutos;
  }

  //Segundos -> Minutos
  public static float converteSegundosParaMinutos(float segundos) {
    return segundos / CONSTANTE_TEMPO;
  }

  //Segundos -> Horas
  public static float converteSegundosParaHoras(float segundos) {
    return segundos/CONSTANTE_TEMPO/CONSTANTE_TEMPO;
  }

  public static void main(String[] args) {
    System.out.println(ConversaoUnidadesTempo.converteSegundosParaHoras(3600));
    System.out.println(ConversaoUnidadesTempo.converteHorasParaMinutos(2));
  }


}
