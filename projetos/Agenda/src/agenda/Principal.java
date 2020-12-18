package agenda;

public class Principal {
  public static void main(String[] args) {
    Agenda agenda1 = new Agenda();
    Agenda agenda2 = new Agenda();

    agenda1.anote(12, 10, "Dia das Crianças");
    agenda2.anote(7, 15, "Dia da Independência");

    agenda1.mostraAnotacao();
    agenda2.mostraAnotacao();

    // Como a classe Agenda não tem encapsulamento, a segurança do código é comprometido. Veja abaixo:

//    agenda2.dia = 7;
//    agenda2.mes = 15;
//    agenda2.anotacao = "Dia da independência";
//    agenda2.mostraAnotacao();
    // O método validaData da classe Agenda foi ignorado.
  }

}
