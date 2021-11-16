package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
  List<Ship> ships = new ArrayList<>();
  boolean isDefeated;
  Random r=new Random();

  public Armada() {
    fillArmada();
  }

  private void fillArmada() {
    ships = new ArrayList<>();
    for (int i = 0; i < r.nextInt(10); i++) {
      ships.add(new Ship());
    }

  }


  public boolean war(Armada otherArmada) {
    while (!(this.ships.isEmpty() || otherArmada.ships.isEmpty())) {
      if (this.ships.get(0).battle(otherArmada.ships.get(0))) {
        otherArmada.ships.remove(0);
      } else {
        this.ships.remove(0);
      }
    }

    return (otherArmada.ships.isEmpty());
  }
}
