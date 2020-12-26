/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaDecisao;

import java.util.Scanner;

/**
 *
 * @author josebezerrafilho
 */
public class JogoDaVelha {
    private static int player;
  private static  int[][] casa = new int[3][3];
  private static int linha, coluna, win;
  private static Scanner leitor = new Scanner(System.in);



  
  public static void desenha(int x, int y) {
    if (casa[x][y] == 1) {
      // campo marcado pelo jogador 1 aparece com “X”
      System.out.print("X");
    } else if (casa[x][y] == 2) {
      // campo marcado pelo jogador 2 aparece com “O”
      System.out.print("O");
    } else {
      // campo não marcado aparece em branco (“ ”)
      System.out.print(" ");
    }
  }

  public static void jogo() {
    // aqui,são mostrados os números das colunas do tabuleiro
    System.out.print("\n  1   2   3\n");
    // aqui é mostrado o número da primeira linha
    System.out.print("1 ");
    // aqui é exibido o campo que cruza a linha 1 com a coluna 1
    desenha(0, 0);
    // caractere de divisão entre dois campos
    System.out.print("  | ");
    // aqui é exibido o campo que cruza a linha 1 com a coluna 2
    desenha(0, 1);
    // caractere de divisão entre dois campos
    System.out.print("  | ");
    // aqui é exibido o campo que cruza a linha 1 com a coluna 3
    desenha(0, 2);
    // desenha linha horizontal e mostra número da linha 2
    System.out.print("\n -----------\n2 ");
    // aqui é exibido o campo que cruza a linha 2 com a coluna 1
    desenha(1, 0);
    // caractere de divisão entre dois campos
    System.out.print("  | ");
    // aqui é exibido o campo que cruza a linha 2 com a coluna 2
    desenha(1, 1);
    // caractere de divisão entre dois campos
    System.out.print("  | ");
    // aqui é exibido o campo que cruza a linha 2 com a coluna 3
    desenha(1, 2);
    // desenha linha horizontal e mostra número da linha 3
    System.out.print("\n -----------\n3 ");
    // aqui é exibido o campo que cruza a linha 3 com a coluna 1
    desenha(2, 0);
    // caractere de divisão entre dois campos
    System.out.print("  | ");
    // aqui é exibido o campo que cruza a linha 3 com a coluna 2
    desenha(2, 1);
    // caractere de divisão entre dois campos
    System.out.print("  | ");
    // aqui é exibido o campo que cruza a linha 3 com a coluna 3
    desenha(2, 2);
  }
  
    public static void main(String[] args) {
        jogo();
    }
}
