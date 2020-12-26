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
public class ProgramaEqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro nome:");
        String nome1 = sc.next();
        
        System.out.println("Digite o segundo nome:");
        String nome2 = sc.next();
        
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes Iguais!");
        } else { 
            System.out.println("Nomes diferentes!");
        }
    }
}
