package fabrica;

public class Teste {
  public static void main(String[] args) {
    Carro meuCarro = new Carro("Passeio", "Preto", "QGS1D82", 5);
    Carro carroJivago = new Carro();
//    meuCarro.setCor("Branco");
    // Foi criado dois objetos com construtores diferentes na classe Carro utilizando o conceito de sobrecarga de construtores.
    System.out.println("A cor do meu carro é: " + meuCarro.getCor());

    Pessoa persona = new Pessoa();
    meuCarro.setDono(persona);
    persona.setNome("Jailheminau");
    System.out.println(meuCarro.getDono().getNome());
    persona.setCarro(meuCarro);
    persona.ligarCarro();
    persona.setCambioCarro(2);

  }

}
