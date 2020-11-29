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
public class ConversorTemperatura {
    public static void main(String[] args) {
        /* kelvin = Celsius + 273.15
           Farenheit = Celsius * 1.8 + 32 
        */
        Scanner leitor = new Scanner(System.in);
        
        float temperatura;
        String escala;
        float celsius, farenheit, kelvin;
        celsius = farenheit = kelvin = 0;
        
        System.out.println("Escreva a escala de temperatura (Celsius, Farenheit, Kelvin):");
        escala = leitor.next();
        
        System.out.println("Escreva o valor da temperatura:");
        temperatura = leitor.nextFloat();
        
        switch (escala) {
                
            case "Celsius":
                celsius = temperatura;
                kelvin = celsius + 273.15f;
                farenheit = celsius * 1.8f + 32f;
                break;
            case "Farenheit":
                farenheit = temperatura;
                celsius = (farenheit-32f)/1.8f;
                kelvin = celsius + 273.15f;
                break;
            case "Kelvin":
                kelvin = temperatura;
                celsius = kelvin - 273.15f;
                farenheit = celsius * 1.8f + 32f;
                break;
        }
        
        System.out.println("Após cálculo das temperaturas, teremos:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Farenheit: " + farenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}
