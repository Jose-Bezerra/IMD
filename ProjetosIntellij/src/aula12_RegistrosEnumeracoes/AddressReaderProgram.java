package aula12_RegistrosEnumeracoes;

import java.util.Scanner;

public class AddressReaderProgram {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Address address = new Address();
    System.out.println("Digite a rua onde mora:");
    address.street = reader.nextLine();
    System.out.println("Digite o número da residência:");
    address.number = reader.nextInt();
    reader.nextLine();
    System.out.println("Digite o bairro:");
    address.district = reader.nextLine();
    System.out.println("Digite a cidade:");
    address.city = reader.nextLine();
    System.out.println("Digite o estado:");
    address.state = reader.nextLine();
    System.out.println("Digite o CEP:");
    address.zip = reader.nextLine();
    System.out.println("---- Seu endereço é ----");
    System.out.println(address.street + " , " + address.number);
    System.out.println(address.district + " , " + address.city);
    System.out.println("CEP " + address.zip +  address.state);
    reader.close();
  }
}
