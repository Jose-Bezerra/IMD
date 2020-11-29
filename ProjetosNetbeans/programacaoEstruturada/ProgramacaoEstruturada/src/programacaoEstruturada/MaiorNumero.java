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
public class MaiorNumero {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        if (a > b && a > c) {
            System.out.println("O maior número é: " + a);
        } else if (b > c) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("O maior número é: " + c);

        }

    }
}
