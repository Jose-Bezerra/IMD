package entitities.oficina;

import java.util.ArrayList;

public class Motor extends Componente{
  private ArrayList<Componente> componente;

  public Motor(String nome, ArrayList<Peca> peca, ArrayList<Componente> componente) {
    super(nome, peca);
    this.componente = componente;
  }

  @Override
  public String toString() {
    return "Motor{" +
        "nome='" + nome + '\'' +
        ", peca=" + peca +
        ", componente=" + componente +
        '}';
  }

  public static void main(String[] args) {

    //Instanciando objetos da classe Peca;
    Peca p1 = new Peca("Tipo1", "10kg", "Ferro");
    Peca p2 = new Peca("Tipo2", "11kg", "Alumínio");
    Peca p3 = new Peca("Tipo3", "12kg", "Plástico");
    Peca p4 = new Peca("Tipo4", "13kg", "Couro");
    Peca p5 = new Peca("Tipo5", "14kg", "Cobre");

    //Criando de uma lista de peças que formará um componente;
    ArrayList componente1 = new ArrayList();
    componente1.add(p1);
    componente1.add(p2);
    componente1.add(p3);

    //Definindo outra coleção ou lista que definirá outro componente.
    ArrayList componente2 = new ArrayList();
    componente2.add(p4);
    componente2.add(p5);

    //Definindo lista com componentes que formam o motor
    ArrayList componentes_motor = new ArrayList();
    componentes_motor.add(componente1);
    componentes_motor.add(componente2);

    //Definindo peças que formam o motor;
    ArrayList pecas_motor = new ArrayList();
    pecas_motor.add(p1);
    pecas_motor.add(p2);
    pecas_motor.add(p3);
    pecas_motor.add(p4);
    pecas_motor.add(p5);


    // Construindo um objeto motor;
    Motor motor = new Motor("Engine Ferrrari", componentes_motor, pecas_motor);
    System.out.println(motor);

  }
}
