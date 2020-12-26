package aula12_RegistrosEnumeracoes;

import java.util.Scanner;

public class AddressReaderProgram1 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Digite seu endereço residencial.");
    Address home = readAddress(reader);
    System.out.println("Digite seu endereço profissional.");
    Address job = readAddress(reader);
    System.out.println("---- Seu endereço residencial: ----");
    printAddress(home);
    System.out.println("---- Seu endereço profissional é: ----");
    printAddress(job);

    reader.close();
  }

  public static Address readAddress(Scanner reader){
    Address address = new Address();
    System.out.println("Digite a rua:");
    address.street = reader.nextLine();
    System.out.println("Digite o número:");
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
    return address;
  }

  public static void printAddress(Address address) {
    System.out.println(address.street + address.number);
    System.out.println(address.district + address.city);
    System.out.println("CEP " + address.zip + address.state);
  }

}
