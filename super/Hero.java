
public class Hero extends Human {

  String power;

  Hero(String name, int age, String power) {
    super(name,age);
    /*this.name = name;
    this.age = age;*/
    this.power = power;
  }
  public String toString (){
    return super.toString()+"\n"+this.power;
  }
}
