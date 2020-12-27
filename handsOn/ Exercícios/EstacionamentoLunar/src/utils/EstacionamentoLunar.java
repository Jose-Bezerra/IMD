package utils;

import entities.NaveTuristica;
import entities.VeiculoDeSolo;
import entities.VeiculoEspacial;

import java.util.HashSet;

public class EstacionamentoLunar {
  public HashSet<VeiculoDeSolo> veiculosDeSoloEstacionados;
  public HashSet<VeiculoEspacial> veiculosEspaciaisEstacionados;

  public EstacionamentoLunar(){
    this.veiculosDeSoloEstacionados = new HashSet<VeiculoDeSolo>();
    this.veiculosEspaciaisEstacionados = new HashSet<VeiculoEspacial>();
  }

  public void estacionar(VeiculoDeSolo veiculo) {
    this.veiculosDeSoloEstacionados.add(veiculo);
  }

  public void estacionar(VeiculoEspacial veiculo) {
    this.veiculosEspaciaisEstacionados.add(veiculo);
  }

  public void saidaVeiculo(VeiculoDeSolo veiculo) {
    System.out.println("Processando saída para veículo de solo " + veiculo.nome);
    veiculo.motorista.pagar(10);
    this.veiculosDeSoloEstacionados.remove(veiculo);
  }

  public void saidaVeiculo(VeiculoEspacial veiculo) {
    System.out.println("Processando saída para veículo espacial " + veiculo.nome);
    veiculo.piloto.pagar(15);
    this.veiculosEspaciaisEstacionados.remove(veiculo);
  }

  public void saidaVeiculo(NaveTuristica veiculo) {
    System.out.println("Processando saída para Nave Turística " + veiculo.nome);
    veiculo.piloto.pagar(20);
    this.veiculosEspaciaisEstacionados.remove(veiculo);
  }

  public int totalVeiculosEstacionados() {
    int total = 0;
    total += this.veiculosDeSoloEstacionados.size();
    total += this.veiculosEspaciaisEstacionados.size();

    return total;
  }

  public void mostrarRelatorio() {
    System.out.println(":: Relatório de Lotação ::");
    System.out.println(" Total Geral: " + totalVeiculosEstacionados());
    System.out.println(" Veículos de Solo: " + this.veiculosDeSoloEstacionados.size());
    for (VeiculoDeSolo veiculo: this.veiculosDeSoloEstacionados){
      System.out.println("\t" + veiculo.nome + " (Motorista: " + veiculo.motorista.nome + ") ");
    }
    System.out.println(" Veículos Espaciais: " + this.veiculosEspaciaisEstacionados.size());
    for (VeiculoEspacial veiculo: this.veiculosEspaciaisEstacionados){
      System.out.println("\t" + veiculo.nome + " (Piloto: " + veiculo.piloto.nome + ") ");
    }
  }
}
