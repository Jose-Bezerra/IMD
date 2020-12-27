import java.util.Scanner;

public class TempoDeJogo {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    Horario inicio = new Horario();
    Horario fim = new Horario();

    System.out.println("Entre com os horários iniciais e finais do jogo:");
    inicio.hora = leitor.nextInt();
    inicio.minuto = leitor.nextInt();
    fim.hora = leitor.nextInt();
    fim.minuto = leitor.nextInt();

    int duracaoEmMinutos = quantosMinutos(fim) - quantosMinutos(inicio);

    if (duracaoEmMinutos <= 0) {
      imprimirDuracao(duracaoEmMinutos + 24*60);
    } else {
      imprimirDuracao(duracaoEmMinutos);
    }

    leitor.close();
  }

  public static int quantosMinutos(Horario h) {
    return h.minuto + h.hora*60;
  }
  public static void imprimirDuracao (int duracao) {
    int duracao_horas = duracao / 60;
    int duracao_minutos = duracao % 60;
    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracao_horas, duracao_minutos);
  }
}



class Horario {
  public int hora;
  public int minuto;

}
