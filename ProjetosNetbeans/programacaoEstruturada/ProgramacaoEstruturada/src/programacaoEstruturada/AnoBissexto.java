/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoEstruturada;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ano para verificar se é Bissexto:");
        int ano = leitor.nextInt();
        
        if (ano % 400 == 0 || (ano % 4 == 00 && ano % 100 != 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        }
        
    }
   
}
