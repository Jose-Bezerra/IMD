/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class Fatorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um inteiro para ver o seu fatorial:");
        int num = sc.nextInt();
        
        int fat = 1;
        int i = num;
        while ( i > 0 ) {            
           fat = fat * i;
           i--;
        }
        
        System.out.printf("O fatorial de %d é %d.\n", num, fat);
    }
}
