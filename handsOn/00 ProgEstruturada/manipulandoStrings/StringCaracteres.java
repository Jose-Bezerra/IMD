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
public class StringCaracteres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = sc.next();
        System.out.println("Imprimindo os caracteres da variável nome de forma "
                + "invertida:");

        for (int i = nome.length() - 1; i >= 0; i--) {
            System.out.print(nome.charAt(i) + " ");
        }
    }
}
