package linhasOnibus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EmpresaOnibus {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    HashSet<Onibus> linhas = new HashSet<Onibus>();

    int option = -1;
    while (option != 0) {
      System.out.println("1 - Cadastrar Linha");
      System.out.println("2 - Listar Linhas Cadastradas");
      System.out.println("0 - Encerrar o programa");
      System.out.println("Digite a opção desejada");

      option = leitor.nextInt();

      if (option == 1 ) {
        System.out.println("Digite o número da linha:");
        String numeroDaLinha = leitor.next();
        Onibus bus = new Onibus(numeroDaLinha);
        linhas.add(bus);
        System.out.println("A linha " + bus.getNumeroDaLinha() + " foi cadastrada. ");
      }

      if (option == 2) {
        System.out.println("Linhas Cadastradas");
        for (Onibus bus: linhas) {
          System.out.println("\t" + bus.getNumeroDaLinha());
        }
      }
    }
   }
}
