import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static  void mainDraw(Graphics graphics) {
    // Rajzolj egy négyzetet, aminek minden oldala más színű!
    graphics.setColor(new Color(200,0,0));
    graphics.drawLine(20, 20, 70, 20);
    graphics.setColor(new Color(100,20,100,150));
    graphics.drawLine(20, 20, 20, 70);
    graphics.setColor(new Color(0,100,0,150));
    graphics.drawLine(20, 70, 70, 70);
    graphics.setColor(new Color(200,200,0));
    graphics.drawLine(70, 20, 70, 70);

  }

  /// Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni.
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
