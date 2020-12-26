package application;

import entities.Automovel;


public class Program {
  public static void main(String[] args) {
    // Terrestre fiat_palio = new Terrestre(5, 4);
    Automovel polo = new Automovel();
    polo.setCapacidade(10000);
    polo.setNumRodas(6);
    int n = polo.calculaNumSteps();
    System.out.println("Num Steps: " + n);
  }
}
