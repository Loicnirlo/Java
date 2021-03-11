

public class methods {
  public static void main(String[] args) {

    String name = "lolox";
    int age = 18;
    hello(name,age);

    int x = 3;
    int y = 4;
    int result;

    result = somme(x,y);
    System.out.println(result);
  }

  static void hello(String name, int age){
    System.out.println("hello "+name+" you're "+age);
  }
  static int somme(int x, int y){
    int res = x + y;
    return res;
  }
}
