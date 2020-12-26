import java.util.ArrayList;
import java.util.List;

public class Generics {
  public static void main(String[] args) {
    List <String> minhaLista = new ArrayList<String>();
    minhaLista.add("José");
    minhaLista.add("Bezerra");
    minhaLista.add("Filho");

    String s = (minhaLista.get(2));
    System.out.println(s);
  }
}
