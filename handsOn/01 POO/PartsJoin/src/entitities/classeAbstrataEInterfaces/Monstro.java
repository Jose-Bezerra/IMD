package entitities.classeAbstrataEInterfaces;

public class Monstro extends Personagem implements Controlavel{

  public Monstro(String nome, float valorAtaque, float valorDefesa) {
    super(nome, valorAtaque, valorDefesa);
  }

  @Override
  public float ataque() {
    return super.getAtaque();
  }

  @Override
  public float defesa() {
    return getDefesa();
  }

  @Override
  public void mover(String direcao) {
    System.out.println("o monstro " + super.getNome() + "está movendo para " + direcao);
  }
}
