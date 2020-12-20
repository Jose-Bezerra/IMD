package application;

import entities.Triangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /* Abaixo usamos uma solução com programação estruturada
        double xA, xB, xC, yA, yB, yC; */

        /* Usaremos POO para solução do problema */
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle A: ");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();
        System.out.println("Enter the measures of triangle B: ");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        leitor.close();
    }

}
