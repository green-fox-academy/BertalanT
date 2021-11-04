import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    /* Hozz létre egy függvényet, ami egy egyenest rajzol és 3 változót vár:
       az vonal kiindulási x és y koordinátáit és a graphics-et.
       A vonal a vászon közepébe fusson.
       Használj egy ciklust arra, hogy a függvényeddel 3 vonalat rajzolj. */
    drawALine(getRandomX(), getRandomY(), graphics);

  }

  private static void drawALine(int x, int y, Graphics graphics) {
    for (int i = 0; i < 3; i++) {
      int xC = x + getRandomX();
      int yC = y + getRandomY();
      int xCenter = WIDTH / 2;
      int yCenter = HEIGHT / 2;
      graphics.drawLine(xC, yC, xCenter, yCenter);
    }
  }

  public static int getRandomX() {
    Random random = new Random();
    int limitX = WIDTH;
    return random.nextInt(limitX);
  }

  public static int getRandomY() {
    Random random = new Random();
    int limitY = HEIGHT;
    return random.nextInt(limitY);
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
