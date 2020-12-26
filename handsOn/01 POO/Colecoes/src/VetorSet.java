import java.util.HashSet;

public class VetorSet {
  public static void main(String[] args) {
    HashSet itens = new HashSet();
    itens.add("Chocolate");
    itens.add("Confeito");
    itens.add("Pipoca");

    System.out.println(itens.contains("Pipoca"));

  }
}
