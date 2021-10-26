import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput1 = scanner.nextLine();
    System.out.println("Hello, " + userInput1 + "!");
  }
}
