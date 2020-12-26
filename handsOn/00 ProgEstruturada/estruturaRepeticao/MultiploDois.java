/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaRepeticao;
import java.util.Scanner;
/**
 *
 * @author josebezerrafilho
 */
public class MultiploDois {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite 5 números interiros:");
      int i = 1;
      int soma = 0;
      while (i <= 5) {            
        int num = sc.nextInt();
        soma = soma + num;
        i = i + 1;
      }
      if (soma % 2 == 0) {
        System.out.println("Múltilplo de 2.");
        System.out.println("Fim.");
      } else {
        System.out.println("Programa encerrado!");
      }
    }
    
}
