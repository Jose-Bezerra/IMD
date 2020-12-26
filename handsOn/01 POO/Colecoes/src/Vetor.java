import java.util.Scanner;

public class Vetor {
  public static void main(String[] args) {
    String nomeAtleta = "Bolt";
    double[] marca = new double[5];

    System.out.println("insira o valor dos tempos obtidos:");
    Scanner leitor = new Scanner(System.in);
    for (int i = 0; i < marca.length; i++) {
      marca[i] = leitor.nextDouble();
    }

    for (int j = 0; j < marca.length; j++) {
      int posicao = j + 1;
      System.out.printf(" Marca %d = %.2f.%n", posicao, marca[j]);
    }

  }
}
