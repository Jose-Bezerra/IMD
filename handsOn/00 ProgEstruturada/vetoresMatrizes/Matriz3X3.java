/*
 * Fazer um progrma para ler um número inteiro N e uma matriz de ordem N conten-
 * do números inteiros. Mostre em seguida a diagonal principal e a quantidade de
 * valores negativos da matriz.
 * EX: 3
 * 5 -3 10; 15 8 2; 7 9 -4;
 */
package vetoresMatrizes;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class Matriz3X3 {

    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
       
       int n = leitor.nextInt();
       int matriz[][] = new int [n][n];
       
       /*Para ler os dados a serem inseridos na matriz, vamos ter que aninhar 
       * os 'For'em que o laço externo percorrerá as linhas e os laços internos
       * percorrerá as colunas.
       */
      
       /* Perceba qua n se refere a quantidade de linhas da matriz e
        * matriz[i].length nos dá o tamanho do vetor linha, oun seja a quantida-
        * de de colunas. */
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        
        System.out.println(); //imprimir quebra de linha;
        
        int count = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ( matriz[i][j] < 0 ){
                    count++;
                }
            }
        }
        
        //EX: 3 ->  5 -3 10; 15 8 2; 7 9 -4;
        System.out.println("Números negativos = " + count);
    }

}
