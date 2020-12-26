import java.util.HashMap;

public class VetorMap {
  public static void main(String[] args) {
    HashMap livros = new HashMap();

    livros.put(1, "Volta ao mundo em 80 dias.");
    livros.put(2, "O pode do subconsciente");
    livros.put(3, "Alice no país das Maravilhas");

    System.out.println(livros.get(2));

  }
}
