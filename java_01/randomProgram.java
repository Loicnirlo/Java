import java.util.Random;

public class randomProgram {
  public static void main(String[] args) {

    Random randomNumber = new Random();

    int x = randomNumber.nextInt(20)-10;

    System.out.println(x);

  }
}
