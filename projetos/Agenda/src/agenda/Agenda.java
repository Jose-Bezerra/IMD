package agenda;

public class Agenda {
  private int dia;
  private int mes;
  private String anotacao;

  public void anote(int dia, int mes, String anotacao){
    this.dia = dia;
    this.mes = mes;
    this.anotacao = anotacao;
    validaData();
  }

  private void validaData() {
    if (( dia < 1 || dia > 31) || ( mes < 1 || mes > 12 )) {
      dia = 0;
      mes = 0;
      anotacao = "Anotação não inserida devido data inválida!";
    }
  }

  public void mostraAnotacao() {
    System.out.println(dia + "/" + mes + ": " + anotacao);
  }

}
