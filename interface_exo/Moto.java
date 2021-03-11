
public class Moto extends Vehicle implements Motorise {

  private String type;
  private int nbroues;
  private String carburant;

  public Moto(){
    this.type = "Moto";
    this.nbroues = 2;
  }

  @Override
  public void faisLePlein(){
    this.carburant = "Essence";
  }

  public String toString(){
    return "type = "+this.type+"\n"+"nbr roues = "+this.nbroues+"\n"+"carburant = "+this.carburant+"\n";
  }
}
