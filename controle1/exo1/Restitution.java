import java.util.Arrays;

public class Restitution {
  public static void main(String[] args) {
    String[] copie = Arrays.copyOf(args,3);
    nom nom;

    for (int i=0; i<copie.length; i++) {
      nom = new nom(copie[i]);
      System.out.print(nom);
    }
  }
}
