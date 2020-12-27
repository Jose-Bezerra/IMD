import java.util.Scanner;

public class BatalhaPokemons {
  public static class Pokemon {
    int ataque;
    int defesa;
    int level;
    int bonus;

    public float valorGolpe() {
      float valorGolpe = (float) (ataque + defesa) / 2;
      if (level % 2 == 0) {
        return valorGolpe + bonus;
      } else {
        return valorGolpe;
      }
    }
  }

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int qtdInstancias = leitor.nextInt();
    Pokemon pokemon[] = new Pokemon[qtdInstancias * 2];

    for (int i = 0; i < qtdInstancias * 2; i += 2) {
      int bonus = leitor.nextInt();

      //Pokemons Gabriel
      pokemon[i] = new Pokemon();
      pokemon[i].ataque = leitor.nextInt();
      pokemon[i].defesa = leitor.nextInt();
      pokemon[i].level = leitor.nextInt();
      pokemon[i].bonus = bonus;

      //Pokemons Duarte
      pokemon[i + 1] = new Pokemon();
      pokemon[i + 1].ataque = leitor.nextInt();
      pokemon[i + 1].defesa = leitor.nextInt();
      pokemon[i + 1].level = leitor.nextInt();
      pokemon[i + 1].bonus = bonus;

    }

    for (int i = 0; i < qtdInstancias * 2; i += 2) {
      if (pokemon[i].valorGolpe() > pokemon[i + 1].valorGolpe()) {
        System.out.println("Gabriel");
      } else if (pokemon[i].valorGolpe() < pokemon[i + 1].valorGolpe()) {
        System.out.println("Duarte");
      } else {
        System.out.println("Empate");
      }
    }
  }
}
