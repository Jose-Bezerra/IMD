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
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = sc.next();
        
        if (nome.length() >= 4 && nome.substring(0, 4)
                .equalsIgnoreCase("José")) {
            System.out.println("Olá, José.");
        } else{
            System.out.println("Upa, lelê.. Você não é José!");
        }
    }
}
