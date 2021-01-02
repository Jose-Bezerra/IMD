package application;

import utils.RelogioPonto;

public class Program {
  public static void main(String[] args) {
    RelogioPonto sedeAlecrim = new RelogioPonto(1, "Alecrim");
    RelogioPonto filialCentro = new RelogioPonto(2, "Centro");
    RelogioPonto filialPotengi = new RelogioPonto(3, "Potengi");


    RelogioPonto.setHora(11);
    RelogioPonto.setMinuto(25);
    RelogioPonto.setMinuto(20);

    System.out.println("Sede Alecrim: " + sedeAlecrim.hora + ":" + sedeAlecrim.minuto + ":" + sedeAlecrim.segundos);
    System.out.println("Filial Centro: " + filialCentro.hora + ":" + filialCentro.minuto + ":" + filialCentro.segundos);
    System.out.println("Filial Potengi: " + filialPotengi.hora + ":" + filialPotengi.minuto + ":" + filialPotengi.segundos);
  }
}
