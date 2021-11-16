package Pirates;

public class WarApp {
  public static void main(String[] args) {
    Armada armada1=new Armada();
    Armada armada2=new Armada();

    System.out.println(
        "Armada1 " + ((armada1.war(armada2)) ? "nyert" : "veszített") + " armada2 ellen.");
  }

}
