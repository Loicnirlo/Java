import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {

    ArrayList<String> food = new ArrayList<String>(); // entre <> mettre wraper class ex : not 'int' but 'Integer'

    food.add("pizza");
    food.add("Burger");
    food.add("Salad");
    food.add(args[0]);
    food.set(0,args[1]);

    for (int i=0; i<food.size(); i++) {
      System.out.println(food.get(i));
    }
  }
}
