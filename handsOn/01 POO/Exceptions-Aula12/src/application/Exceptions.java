package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException err){
      System.out.println("Invalid Position");
    } catch (InputMismatchException err) {
      System.out.println("Input error");
    }

    System.out.println("Fim do programa");


    sc.close();
  }
}
