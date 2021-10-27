import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Kérem az első számot: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.print("Kérem az második számot: ");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);

        }
    }
}
