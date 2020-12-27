import java.util.Scanner;

public class Voleibol {

  public static class Time {
    int totalS, totalB, totalA;
    int acertoS, acertoB, acertoA;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jogadores;
    String nome;
    Time dados = new Time();

    jogadores = sc.nextInt();
    dados.totalS = dados.totalB = dados.totalA = dados.acertoS = dados.acertoB = dados.acertoA = 0;


    for (int i = 0; i < jogadores; i++) {
      nome = sc.next();
      dados.totalS += sc.nextInt();
      dados.totalB += sc.nextInt();
      dados.totalA += sc.nextInt();
      dados.acertoS += sc.nextInt();
      dados.acertoB += sc.nextInt();
      dados.acertoA += sc.nextInt();
    }
    System.out.printf("Pontos de Saque: %.2f %%.\n", (float)dados.acertoS/dados.totalS * 100);
      System.out.printf("Pontos de Bloqueio: %.2f %%.\n", (float)dados.acertoB/dados.totalB * 100);
      System.out.printf("Pontos de Ataque: %.2f %%.\n", (float)dados.acertoA/dados.totalA * 100);


    sc.close();
  }

}

