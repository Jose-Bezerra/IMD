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
public class CondicaoTernaria {
    public static void main(String[] args) {
        
        float preco = 34.5f;
        float desconto = (preco < 20.0f) ? preco * 0.1f : preco * 0.05f;
        
        System.out.println(desconto);
    }
}
