public class Nom {
  private String nom1, nom2, nom3;

  public Nom(String name1,String name2,String name3){
    this.nom1 = name1;
    this.nom2 = name2;
    this.nom3 = name3;
  }

  public String toString(){
    return "["+this.nom1+", "+this.nom2+", "+this.nom3+"]";
  }
}
