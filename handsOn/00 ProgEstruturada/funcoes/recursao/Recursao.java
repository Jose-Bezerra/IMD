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
public class Recursao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para ser dobrado várias vezes:");
        int num = sc.nextInt();
        System.out.println("Digite um número limite para operação:");
        int limite = sc.nextInt();
        System.out.println(dobrarNumeroAteLimite(num, limite));
            
    }
    
    public static int dobrarNumeroAteLimite(int num, int limite) {
        int dobro = 2 * num;
        if (dobro >= limite){
            return num;
        } else {
            return dobrarNumeroAteLimite(dobro, limite);
        }
             
    }
}
