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
public class AreaPrecoTerreno {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
    }

}
