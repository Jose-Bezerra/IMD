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
public class FuncaoNumeroMaior {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        
        int maior = max(a, b, c);
        mostrarResultado(maior);
    }
    
    /* public - Sempre começamos uma função com esse prefixo que a torna dispo-
    nível para qualquer classe Java.
       static - Permite a funçao ser chamada independente da criação de um obje-
    to.
       int - Tipo do dado retornado
       void - Função sem retorno, executa apenas uma ação como imprimir na tela. 
    */
    
    public static int max ( int x, int y, int z ) {
       int aux;
       
       if ( x > y && x > z ) {
           aux = x;
       } else if ( y > z) {
           aux = y;
       } else {
           aux = z;
       }
       
       return aux;
    }
    
    public static void mostrarResultado ( int value ){
        System.out.println("O maior número digitado é: " + value + ".");
    } 
    
    
}
