package sobrecarga;

/***
 *  Criamos a classe sobrecarga.Calculadora para exemplificar o polimorfismo com a sobrecarga de métodos.
 */
public class Calculadora {
  public int somar ( int n1, int n2) {
    return n1 + n2;
  }

  public int somar ( int n1, int n2, int n3) {
    return n1 + n2;


  } public double somar ( double n1, double n2, double n3) {
    return n1 + n2 + n3;
  }

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    System.out.println(calc.somar(7, 2));
    System.out.println(calc.somar(8, 7, 15));
  }
}
