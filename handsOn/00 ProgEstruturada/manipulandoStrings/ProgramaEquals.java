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
public class ProgramaEquals {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        
        if (nome1.equals(nome2)){
            System.out.println("Nomes iguais!");
        } else  {
            System.out.println("Nomes diferentes!");
        }
    }
}
