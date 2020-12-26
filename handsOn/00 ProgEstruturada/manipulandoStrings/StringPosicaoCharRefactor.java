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
public class StringPosicaoCharRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        
        String nome = sc.next();
        char ponto = '.';
        
        int inicio = 0;
        int posicao = nome.indexOf(ponto);
        if (posicao == -1){
            System.out.println("Não existe ponto no nome!");
        } else {
            
            System.out.println("Existem ponto nas posição(es):");

            while (inicio < nome.length() && posicao != -1) {
                System.out.println(posicao);
                inicio = posicao + 1;
                posicao = nome.indexOf(ponto, inicio);
            }
        }
    }
     
}
