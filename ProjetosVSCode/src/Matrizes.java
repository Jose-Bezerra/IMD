import java.util.Scanner;

/**
 * Matrizes
 */
public class Matrizes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int [] [] matriz = new int [num] [num];
    // Perceba que o for interno percorre as posições do array formado em cada linha. O for externo percorre as colunas;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz [i][j] = sc.nextInt();
      }
    }

    System.out.println("Main Diagonal:");
    for (int i = 0; i < matriz.length; i++) {
      System.out.println( matriz[i][i] );      
    }
    System.out.println();

    int count = 0;
    // Para encontrar números negativos, teremos que percorrer novamente a matriz.
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] < 0) {
          count++;
        }
      }
      
    }

    System.out.println("Negative  numbers: " + count);

    sc.close();
  }
}