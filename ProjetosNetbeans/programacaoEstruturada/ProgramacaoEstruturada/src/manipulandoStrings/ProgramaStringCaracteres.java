/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandoStrings;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class ProgramaStringCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String nome = sc.next();
        char [] caracteres = nome.toCharArray();
        
        System.out.println("Imprimindo os caracteres da variável nome de forma "
                + "invertida:");
        
        for (int i = caracteres.length -1; i >= 0; i--) {
            System.out.print(caracteres[i] + " ");
        }
    }
}
