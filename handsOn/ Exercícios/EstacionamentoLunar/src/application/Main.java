package application;

import entities.*;
import utils.EstacionamentoLunar;

public class Main {
  public static void main(String[] args) {
    // Instanciando Objetos
    EstacionamentoLunar viaLua = new EstacionamentoLunar();

    Motorista jose = new Motorista("José Bezerra", 1704979);
    Motorista adriano = new Motorista("Adriano Pinheiro", 1589746);
    Motorista mariana = new Motorista("Maraina Silva", 587979);
    Motorista silvana = new Motorista("Silvava Nimle", 568742);
    Piloto maria = new Piloto("Maria Josefa", 56428);
    Piloto zuleide = new Piloto("Zuleide Santos", 568799);

    OnibusLunar busaoLunar01 = new OnibusLunar("Busao Lunar Mk1", 2020, jose, 24);
    OnibusLunar busaoLunar02 = new OnibusLunar("Busão Lunar MK3", 2020, adriano, 20);
    TratorLunar trator01 = new TratorLunar("Stone Breaker", 2054, mariana, 4);
    TratorLunar trator02 = new TratorLunar("RiverRide", 2078, silvana, 6);
    NaveTuristica navigator = new NaveTuristica("Navigator", 2074, maria, 12);
    NaveCargueira starwar = new NaveCargueira("StarWar", 2154, zuleide, 18, 80000);

    viaLua.estacionar(busaoLunar01);
    viaLua.estacionar(busaoLunar02);
    viaLua.estacionar(trator01);
    viaLua.estacionar(trator02);
    viaLua.estacionar(navigator);
    viaLua.estacionar(starwar);

    viaLua.mostrarRelatorio();
    System.out.println();

    //Processar saida de alguns veículos
    viaLua.saidaVeiculo(busaoLunar02);
    System.out.println();
    viaLua.saidaVeiculo(navigator);
    System.out.println();
    viaLua.saidaVeiculo(starwar);
    System.out.println();

    viaLua.mostrarRelatorio();

  }
}
