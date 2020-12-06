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
public class FatorialIterativo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para cálculo do fatorial:");
        int num = sc.nextInt();
        int fat = fatorial(num);
        
        if (fat > 0) {
            System.out.println("O fatorial desse número é: " + fat + ".");
        } else {
            System.out.println("Não existe fatorial para números negativos!");
        }
        
    }
    
    public static int fatorial(int numero){
        int fat;
        if (numero < 0) {
            fat = -1;
        } else if (numero == 0) {
            fat = 1;
        } else {
            fat = 1;
            for (int i = 2; i <= numero; i++) {
                fat = fat * i;
            }
        }
        return fat;
    }
    
}
// Este exemplo mostra a lógica tradicional para cálculo do fatorial.