import java.util.Scanner;
import java.util.Random;

public class array2D {
  public static void main(String[] args) {

    int i, j, a, b;

    Scanner scanner = new Scanner(System.in);
    Random randomNumber = new Random();

    System.out.println("Taille tableau (lignes : )");
    a = scanner.nextInt();
    System.out.println("Taille tableau (colonnes : )");
    b = scanner.nextInt();

    String[][] tab = new String[a][b];

    for (i=0 ; i<tab.length ; i++) {
      for (j=0; j<tab[i].length ; j++) {
        tab[i][j] = String.valueOf(randomNumber.nextInt(10));
        System.out.print(tab[i][j]+" ");
      }
        System.out.println();
    }

  }
}
