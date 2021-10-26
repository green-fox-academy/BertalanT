import java.util.Scanner;

public class LegsOfAnimals {
  public static void main(String[] args) {
    System.out.print("chickens: ");
    Scanner chickens = new Scanner(System.in);
    String chickenInput = chickens.nextLine();
    System.out.print("pigs: ");
    Scanner pigs = new Scanner(System.in);
    String pigsInput = pigs.nextLine();
    System.out.println(chickenInput);
    System.out.println(pigsInput);
  }
}
