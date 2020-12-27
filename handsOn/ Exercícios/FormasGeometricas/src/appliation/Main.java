package appliation;

import entities.Circulo;
import entities.Quadrado;
import entities.Retangulo;

public class Main {
  public static void main(String[] args) {
    Retangulo ret1 = new Retangulo(5, 3 );
    System.out.println(ret1.calcularArea());
    System.out.println(ret1.calcularPerimetro());

    Circulo circ1 = new Circulo(4);
    System.out.println(circ1.calcularArea());
    System.out.println(circ1.calcularPerimetro());

    Quadrado squad = new Quadrado(6);
    System.out.println(squad.calcularArea());
    System.out.println(squad.calcularPerimetro());

  }
}
