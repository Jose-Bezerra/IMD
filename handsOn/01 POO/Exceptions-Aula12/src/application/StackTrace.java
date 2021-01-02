package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
  public static void main(String[] args) {
    method1();
    System.out.println("Fim do programa");
  }
  public static void method1(){
    System.out.println("* * * Method1 Start * * *");

    method2();

    System.out.println("* * * Method1 End * * *");

  }

  public static void method2() {
    System.out.println("* * * Method2 Start * * *");
    Scanner sc = new Scanner(System.in);

    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("Invalid Position");
      err.printStackTrace();
      sc.next();
    } catch (InputMismatchException err) {
      System.out.println("Input error");
    }


    sc.close();
    System.out.println("* * * Method2 End * * *");
  }
}
