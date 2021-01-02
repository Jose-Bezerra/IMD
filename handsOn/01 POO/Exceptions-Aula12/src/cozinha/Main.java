package cozinha;

public class Main {
  public static void main(String[] args) throws Exception {

    Cozinha cozinha = new Cozinha();

    //Criar receitas e adicionar  os ingredientes
    Receita macarronada = new Receita("Macarronada");
    try {
      macarronada.AdicionarIngrediente("Macarrão", 500.0f);
      macarronada.AdicionarIngrediente("Tomate", 4.0f);
    } catch (QuantidadeException e) {
      System.out.println(e.getMessage());
    }

    Receita doceDeLeite = new Receita("Doce de leite");
    try {
      doceDeLeite.AdicionarIngrediente("Leite", 1000.0f);
      doceDeLeite.AdicionarIngrediente("Açucar", 500.0f);
    } catch (QuantidadeException e) {
      System.out.println(e.getMessage());
    }

    //Adicionar receitas na cozinha
    cozinha.AdicionarReceita(macarronada);
    cozinha.AdicionarReceita(doceDeLeite);

    //Adicionar ingrediente no estoque da cozinha
    try {
      cozinha.AdicionarNoEstoque("Macarrão", 1000.0f);
      cozinha.AdicionarNoEstoque("Tomate", 15.0f);
      cozinha.AdicionarNoEstoque("Leite", 1000.0f);
      cozinha.AdicionarNoEstoque("Açucar", 2000.0f);
      cozinha.AdicionarNoEstoque("Mostarda", 400.0f);
    } catch (QuantidadeException e) {
      System.out.println(e.getMessage());
    }

    //Preparação de receitas
//    try {
//      cozinha.preparaReceita(macarronada);
//      cozinha.limparFogao();
//      cozinha.preparaReceita(doceDeLeite);
//      cozinha.limparFogao();
//      cozinha.preparaReceita(doceDeLeite);
//      cozinha.limparFogao();
//      cozinha.preparaReceita(macarronada);
//      cozinha.limparFogao();
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }

    Receita pedidos[] = {macarronada, doceDeLeite, doceDeLeite, macarronada};
    for (Receita receita: pedidos) {
      try {
        cozinha.preparaReceita(receita);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      } finally {
        cozinha.limparFogao();
      }
    }

  }
}
