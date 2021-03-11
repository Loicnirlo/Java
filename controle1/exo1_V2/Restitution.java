import java.util.Arrays;

public class Restitution {
  public static void main(String[] args) {
    String[]copie = Arrays.copyOf(args, 3);

    Nom res = new Nom(copie[0],copie[1],copie[2]);
    System.out.println(res);
  }
}
