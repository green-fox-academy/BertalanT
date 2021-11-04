import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < 4; i++) {
      Random random = new Random();
      int x = random.nextInt(WIDTH);
      int y = random.nextInt(HEIGHT);
      int width = random.nextInt(WIDTH - x);
      int height = random.nextInt(HEIGHT - y);
      graphics.setColor(getRandomColor());
      graphics.drawRect(x, y, width, height);
    }
  }


  public static Color getRandomColor() {
    Random random = new Random();
    int limit = 256;
    return new Color(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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