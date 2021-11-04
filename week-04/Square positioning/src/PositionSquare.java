import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void mainDraw(Graphics graphics) {
    // hozz létre egy függvényt, ami egy négyzetet rajzol a vászonra
    // a függvény 3 változót várjon: a négyzet bal felső sarkának a
    // koordinátáit és a graphics-ot és rajzoljon egy 50 x 50-es
    // négyzetet
    // rajzoltass ki 3 négyzetet a függvényeddel
    // kerüld a kódismétlést

    //getSquare(xRandom, yRandom, graphics);

    for (int i = 0; i < 3; i++) {
      Random random = new Random();
      int width = 50;
      int height = 50;
      int x = random.nextInt(WIDTH - width);
      int y = random.nextInt(HEIGHT - height);
      getSquare(x, y, graphics);
    }
  }

  private static void getSquare(int x, int y, Graphics graphics) {
    int width = 50;
    int height = 50;
    graphics.drawRect(x, y, width, height);
  }

}
  static int WIDTH = 320;  // vászon szélessége
  static int HEIGHT = 320; // vászon magassága

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }
}
