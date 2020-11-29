/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaoEstruturada;

/**
 *
 * @author josebezerrafilho
 */
public class FormatandoStrings {
    public static void main(String[] args) {
        
        String exemplo = "abcde FGHIJ ABC abc DEFG   ";
        
        // Modificando strings.
        String ex01 = exemplo.toLowerCase();
        String ex02 = exemplo.toUpperCase();
        String ex03 = exemplo.trim();
        String ex04 = exemplo.substring(2);
        String ex05 = exemplo.substring(2, 9);
        String ex06 = exemplo.replace('a', 'x');
        String ex07 = exemplo.replace("abc", "xy");
        int i = exemplo.indexOf("bc");
        int j = exemplo.lastIndexOf("bc");
        String[] vect = exemplo.split(" ");
        
        
        //Imprimindo resultados.
        System.out.println("exemplo: -" + exemplo + "-");
        System.out.println("toLowerCase: -" + ex01 + "-");
        System.out.println("trim: -" + ex03 + "-");
        System.out.println("substring(2)_: -" + ex04 + "-");
        System.out.println("substring(2,9): -" + ex05 + "-");
        System.out.println("replace('a', 'x): -" + ex06 + "-");
        System.out.println("replace('abc', 'xy): -" + ex07 + "-");
        System.out.println("indexOf('bc): " + i);
        System.out.println("lastIndexOf('bc):" + j);
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
        
    }
}
