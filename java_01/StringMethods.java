

public class StringMethods {
  public static void main(String[] args) {
    String mdp = "lolox";

    /*boolean result = mdp.equalsIgnoreCase("Lolox"); // Ignorecase => pour ignorer difference majuscule/minuscule

    if(result == false){
      System.out.println("Wrong password");
    }
    if(result == true){
      System.out.println("Correct password");
    }*/
    // char result = mdp.charAt(0); // recupere le character a la position 0
    // int result = mdp.indexOf("l"); // donne position du premier char correspondant
    // boolean result = mdp.isEmpty(); // verfifie si mdp est vide
    String result = mdp.replace("o", "a");

    System.out.println(result);
  }
}
