/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoEstruturada;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com um número inteiro para sequência de Fibonacci:");
        int n = leitor.nextInt();

        //Dois primeiros elementos da sequência Fibonacci
        int n1 = 0;
        int n2 = 1;
        int aux = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");
            aux = n2 + n1;
            n1 = n2;
            n2 = aux;

        }

    }

}
