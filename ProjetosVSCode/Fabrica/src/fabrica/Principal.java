public class Principal {
  public static void main(String[] args) {
    Carro meuCarro = new Carro();
    meuCarro.setCor("Branco");
    System.out.println("Meu carro tem a cor: " + meuCarro.getCor());
    Carro carroNatalia = new Carro("Passeio", "Branco", "QGS1D82", 3);

    Pessoa person = new Pessoa();
    meuCarro.setDono(person);
    person.setNome("José Bezerra");
    System.out.println(meuCarro.getDono().getNome());
  }
}
