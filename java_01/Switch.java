import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What day is it ?");
    String day = scanner.nextLine();
    System.out.println("What's the date ?");
    int date = scanner.nextInt();

    switch(day) {
      case "Sunday":
        System.out.println("It's Sunday "+date);
        break;
      case "Monday":
        System.out.println("It's Monday "+date);
        break;
      case "Tuesday":
        System.out.println("It's Tuesday "+date);
        break;
      case "Wenesday":
        System.out.println("It's Wenesday "+date);
        break;
      case "Thursday":
        System.out.println("It's Thursday "+date);
        break;
      case "Friday":
        System.out.println("It's Friday "+date);
        break;
      case "Saturday":
        System.out.println("It's Satuday ");
        break;
      default: System.out.println("Not a day");
    }
  }
}
