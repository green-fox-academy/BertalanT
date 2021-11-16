package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  Pirate captain;
  List<Pirate> pirates = new ArrayList<>();
  private Random r = new Random();

  public Ship(){
    fillShip();
  }

  public void fillShip() {
    Pirate pirate = new Pirate();
    captain = pirate;
    pirates.add(pirate);
    for (int i = 0; i < r.nextInt(113); i++) {
      pirates.add(new Pirate());
    }
  }

  public boolean battle(Ship otherShip) {

    int shipPoints = getAliveMembersCount() - captain.drunkLevel;
    int otherSipPoints = otherShip.getAliveMembersCount() - otherShip.captain.drunkLevel;

    if (shipPoints > otherSipPoints) {


      lostTeam(otherShip);
      wonTeam(this);

      return true;
    } else if (shipPoints < otherSipPoints) {

      lostTeam(this);
      wonTeam(otherShip);


      return false;
    } else {

      lostTeam(otherShip);
      wonTeam(otherShip);
      lostTeam(this);
      wonTeam(this);

      return false;
    }

  }

  private void wonTeam(Ship ship) {

    for (int i = 0; i < ship.getAliveMembersCount(); i++) {
      Pirate pirate = ship.pirates.get(i);
      if (pirate.isAlive) {
        for (int j = 0; j < r.nextInt(5); j++) {
          pirate.drinkSomeRum();
        }
      }
    }
  }

  private void lostTeam(Ship ship) {

    int leftToDie = r.nextInt(ship.getAliveMembersCount());

    for (int i = 0; i < ship.pirates.size(); i++) {

      Pirate pirate = ship.pirates.get(i);
      if (leftToDie == 0) {
        break;
      }
      if (pirate.isAlive && leftToDie > 0) {
        pirate.die();
        leftToDie--;

      }
    }

  }
  public void getCondition() {
    System.out.print("A kapitány által fogyasztott rumok száma:" + captain.drunkLevel + ". ");
    System.out.println(captain.isAlive ? "A kapitány még él" : "A kapitány már halott");
    System.out.println("A legénységből még élnek:" + getAliveMembersCount());
  }

  private int getAliveMembersCount() {
    int result = 0;
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).isAlive) {
        result++;
      }
    }
    return result;
  }
}
