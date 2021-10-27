public class Conditionals {
  public static void main(String[] args) {
    int a = 0;
    while (a < 10) {
      System.out.println(a); // Terminálban látható: a számok 0-tól 9-ig
      a += 1;
    }

    for (int i = 0; i < 100; i++) {
      System.out.print(i); // Terminálban látható: a számok 0-tól 99-ig
    }
  }
}
