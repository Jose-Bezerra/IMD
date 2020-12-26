package sobreposicao;

public class Program {
  public static void main(String[] args) {
    Dog cachorro = new Dog();
    Cat gato = new Cat();
    cachorro.comunicar();
    gato.comunicar();
    Animal qualquer = new Animal();
    qualquer.comunicar();

    Car polo = new Car();
    Remote controleRemoto = new Remote(polo);
    controleRemoto.mover();
  }
}

