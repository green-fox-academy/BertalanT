import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Kérek egy számot: ");
    Scanner scanner = new Scanner(System.in);
    int OneTwoALot = scanner.nextInt();
    if (OneTwoALot <= 0) {
      System.out.println("Nem elég!");
    } else if (OneTwoALot == 1) {
      System.out.println("Egy");
    } else if (OneTwoALot == 2) {
      System.out.println("Kettő");
    } else {
      System.out.println("Sok");
    }
  }
}
