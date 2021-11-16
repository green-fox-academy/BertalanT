package Pirates;

public class BattleApp {
  public static void main(String[] args) {

    Ship ship1 = new Ship();
    Ship ship2 = new Ship();

    ship1.fillShip();
    ship2.fillShip();
    System.out.println("Csata előtt");
    ship1.getCondition();
    ship2.getCondition();

    ship1.battle(ship2);
    System.out.println();
    System.out.println();
    System.out.println("Csata után");
    ship1.getCondition();
    ship2.getCondition();
  }

}
