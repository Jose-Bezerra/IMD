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
public class Somatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para ver seu somatorial:");
        int num = sc.nextInt();
        System.out.println(somatorial(num));
    }
    
    public static int somatorial( int numero ) {
        int soma = 0;
        if ( numero <= 0 ){
            soma = 0;
        } else {
            soma = numero + somatorial(numero - 1);
        }
        return soma;
    }
}

// Resultado esperado: somatorial(5) = 5+4+3+2+1 => 15
