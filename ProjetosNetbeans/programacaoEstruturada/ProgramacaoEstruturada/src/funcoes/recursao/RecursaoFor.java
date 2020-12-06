/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes.recursao;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class RecursaoFor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para ser dobrado várias vezes:");
        int num = sc.nextInt();
        System.out.println("Digite um número limite para operação:");
        int limite = sc.nextInt();
        System.out.println(dobrarNumeroAteLimite(num, limite));
            
    }
     
     public static int dobrarNumeroAteLimite ( int num, int limite ) {
         for (int i = num * 2; i < limite; i = num * 2) {
             num = i;
         }
         
         return num;
     }
}
