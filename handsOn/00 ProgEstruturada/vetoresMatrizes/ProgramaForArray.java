/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoresMatrizes;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class ProgramaForArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /* Cuidado, pois a variável com o tamanho do vetor pode não existir */
        //int valores[] = new int[10];
        
        System.out.println("Digite a quantidade de valores a digitar:");
        int valores[] = new int[sc.nextInt()];
        /* Tenha cuidado na variável de iteração i pois ela será usada para ar-
        mazenar os dados de forma indexada. Sempre começar por zero. Observe tam-
        qu se o usuário digitar um valor menor que 10, o programa irá levantar uma
        excessão. Por esta razão usamos o método lenght.
        */
        System.out.println("Digite agora os valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }
        
        System.out.println("Valores digitados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
