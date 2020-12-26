package recursao;

import java.util.Scanner;


public class Recursao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número para dobrar várias vezes:");
    int num = sc.nextInt();
    System.out.println("Digite um número limite:");
    int limite = sc.nextInt();
    System.out.println(dobrarNumeroAteLimite(num, limite));
    sc.close();
  }

  public static int dobrarNumeroAteLimite(int numero, int limite) {
    for (int aux = 2 * numero; aux <= limite; aux = 2 * numero) {
      numero = aux;
    }
    return numero;
  }
}

