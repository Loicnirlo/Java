import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int i;

    System.out.println("Taille du tableau : ?");
    int nbr = scanner.nextInt();

    int[] tab = new int[nbr];
    System.out.println("taille du tableau = "+tab.length);

    for (i=0; i<nbr; i++) {
      System.out.println(tab[i]);
    }

  }
}
