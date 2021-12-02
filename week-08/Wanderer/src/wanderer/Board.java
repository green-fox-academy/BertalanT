package wanderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int imgSize = 72;


  int testBoxX;
  int testBoxY;

  public Board() {
//    testBoxX = 300; így középen jelenik meg
//    testBoxY = 300;

    // beállítja a rajztábla méretét
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
   // graphics.fillRect(testBoxX, testBoxY, 100, 100);
    // Van egy 720 x 720-as rajztábla
    // Az alábbi class-al készíthetsz és rajzolhatsz ki egy képet. pl.:
    for (int i = 0; i <10 ; i++) {
      for (int j = 0; j <10 ; j++) {
        PositionedImage floorImage = new PositionedImage("img/floor.png", i * imgSize, j * imgSize );
        floorImage.draw(graphics);
      }
    }

    PositionedImage heroImage = new PositionedImage("img/hero-down.png", testBoxX, testBoxY);
    heroImage.draw(graphics);
  }

  public static void main(String[] args) {
    // Itt láthatod, hogy készíthetsz egy új ablakot, és hogyan adhatod hozzá a táblánkat (board).
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Itt láthatod, hogy adsz hozzá gomb esemény figyelőt (key event listener)
    // A board object értesítődik ha valamelyik gomb lenyomásra kerül
    // és a rendszer meghívja az alábbi 3 függvény egyikét
    frame.addKeyListener(board);
    // Figyeld meg, (fent) hogy csak így tudjuk kivitelezni
    // mivel a Board class (a board object típusa) is egy KeyListener
  }

  // Hogy legyen egy KeyListenerünk, a classnak erre a 3 függvényre van szüksége.
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // De valójában csak ezt a függvényt használjuk a projekt során
  @Override
  public void keyReleased(KeyEvent e) {
    // Mikor megnyomódik a lefele vagy felfele gomb, a négyzetünk pozíciója változik
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= imgSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += imgSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += imgSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= imgSize;
    } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      System.out.println("FIGHT!");
    }
    // és újra testBoxX += 100;  rajzolódik az új koordinátákkal
    repaint();

  }

}

