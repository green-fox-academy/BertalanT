import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // hozz létre egy függvényt, ami egy négyzetet rajzol a vászonra
    // és 2 változót vár: a négyzet méretét és a graphics-ot
    // a függvénynek a vászonra úgy kell a négyzetet rajzolnia,
    // hogy a négyzet közepe a vászon közepén legyen, a megadott méretben
    // rajzoltass ki 3 négyzetet a függvénnyel
    for (int i = 0; i < 3; i++) {
      Random random = new Random();
      int size = random.nextInt(WIDTH + 1);
      drawSquare(size, graphics);
    }

  }

  private static void drawSquare(int size, Graphics graphics) {
    int x1 = WIDTH / 2 - size / 2;
    int y1 = HEIGHT / 2 - size / 2;
    graphics.drawRect(x1, y1, size, size);
  }

  // Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni.
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
