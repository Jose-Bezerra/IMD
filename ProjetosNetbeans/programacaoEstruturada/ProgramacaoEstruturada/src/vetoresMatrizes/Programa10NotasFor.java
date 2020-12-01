/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoresMatrizes;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class Programa10NotasFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de notas a serem lidas:");
        int quantidade = leitor.nextInt();
        double notas[] = new double[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Entre com a nota %d: ", i+1);
            notas[i] = leitor.nextDouble();
            double aux = notas[i];
            int j = i + 1;
            System.out.printf("A nota digitada foi %.2f, com indíce %d na posiçao %d.%n", notas[i], i, notas.length);
//            System.out.println("A nota digitada foi " + notas[i] + " com índice " + i + " na posição " + j);
           
        }
        
    }
}
    