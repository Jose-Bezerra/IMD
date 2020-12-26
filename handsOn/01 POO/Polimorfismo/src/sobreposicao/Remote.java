package sobreposicao;

public class Remote {
  private Toys brinquedo;

  public Remote(Toys brinquedo){
    this.brinquedo = brinquedo;
  }

  public void mover(){
    brinquedo.mover();
  }
}
