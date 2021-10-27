import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int oddEven = scanner.nextInt();
        if (oddEven %2  == 0) {
            System.out.println("Páros");
        } else {
            System.out.println("Páratlan");
        }
    }
}
