package entitities.classeAbstrataEInterfaces;

public abstract class Personagem {
  private String nome;
  private float Ataque;
  private float Defesa;

  public Personagem(String nome, float Ataque, float Defesa) {
    this.nome = nome;
    this.Ataque = Ataque;
    this.Defesa = Defesa;
  }

  public String getNome() {
    return nome;
  }

  protected float getAtaque() {
    return Ataque;
  }

  protected float getDefesa() {
    return Defesa;
  }

  //Métodos abstratos que devem ser implementados nas classes concretas
  public abstract float ataque();
  public abstract float defesa();
}
