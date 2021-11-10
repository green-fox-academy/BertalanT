package PostIt;

public class Colors {
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt("narancs", "Ötlet1", "kék");
    System.out.println(postIt1.getBackgroundColor() + " "
        + postIt1.getText() + " "
        + postIt1.getTextColor());
    PostIt postIt2 = new PostIt("rózsaszín", "Csodálatos", "fekete");
    System.out.println(postIt2.getBackgroundColor() + " "
        + postIt2.getText() + " "
        + postIt2.getTextColor());
    PostIt postIt3 = new PostIt("citromsárga", "Fenséges!", "zöld");
    System.out.println(postIt3.getBackgroundColor() + " "
        + postIt3.getText() + " "
        + postIt3.getTextColor());
//    System.out.println(postIt1.getBackgroundColor());
//    System.out.println(postIt2.getText());
//    System.out.println(postIt3.getTextColor());

  }

}

//Készíts néhány minta post-it példányt:
//egy narancssárgát kék szöveggel: "Ötlet 1"
//egy rózsaszínt fekete szöveggel: "Csodálatos"
//egy citromsárgát zöld szöveggel: "Fenséges!"