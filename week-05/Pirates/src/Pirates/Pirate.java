package Pirates;
import java.util.Random;

public class Pirate {
  protected static int number = 1;
  protected String name;
  protected int drunkLevel;
  protected boolean isAlive=true;

  public Pirate() {
    name = number + " számú kalóz";
    number++;
  }

  public Pirate(String name) {
    this.name = name;
    number++;
  }

  public void drinkSomeRum() {
    if (!isAlive) {
      System.out.println("ez már megdöglött");
    } else {
      drunkLevel++;
    }
  }

  public void howsItGoingMate() {
    if (!isAlive) {
      System.out.println("ez már megdöglött");
    } else {
      if (drunkLevel != 0) {

        Random r = new Random();
        for (int i = 0; i < r.nextInt(4); i++) {
          System.out.println("Tőccsé mán egy másikot tee!");
          drunkLevel++;
        }
      } else {
        System.out.println("Arghh, énnnegy kalóz vagyok! Mit gondossz, hogyanis lehetnék?");
      }
    }
  }

  public void brawl(Pirate pirate) {
    if (isAlive && pirate.isAlive) {
      Random r = new Random();
      int battleResult = r.nextInt(3);

      if (battleResult == 3) {
        die();
      } else if (battleResult == 2) {
        pirate.die();
      } else {
        die();
        pirate.die();
      }
    } else if (!isAlive && pirate.isAlive) {
      System.out.println(name + " Már megdöglött.");
    } else if (isAlive && !pirate.isAlive) {
      System.out.println(pirate.name + " Már megdöglött.");
    } else {
      System.out.println("Ezek már megdöglöttek.");
    }
  }

  public void die() {
    isAlive = false;
    //System.out.println(name + " megdöglött.");
  }

  public String getName() {
    if (!isAlive) {
      return name + " megdöglött.";
    } else {
      return name;
    }
  }
}
