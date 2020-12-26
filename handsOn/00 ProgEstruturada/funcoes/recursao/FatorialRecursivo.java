/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes.recursao;

import static funcoes.recursao.FatorialIterativo.fatorial;
import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class FatorialRecursivo {

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
    
    /* public - Sempre começamos uma função com esse prefixo que a torna dispo-
    nível para qualquer classe Java.
       static - Permite a funçao ser chamada independente da criação de um obje-
    to.
       int - Tipo do dado retornado
       void - Função sem retorno, executa apenas uma ação como imprimir na tela. 
    */
    
    public static int fatorial(int numero){
        int fat;
        if (numero < 0) {
            fat = -1;
        } else if (numero == 0) {
            fat = 1;
        } else {
            fat = numero * fatorial(numero - 1);
        }
        
        return fat;
    }
}
