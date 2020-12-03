/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaDecisao;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class NotasAlunos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a nota do aluno");
        float nota = leitor.nextFloat();
        
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 3) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
     
}
