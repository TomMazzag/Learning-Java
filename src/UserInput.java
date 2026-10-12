import java.util.Scanner;

// Using a scanner
// A scanner is an object that allows user input
public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String askName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static int askInitialBalance() {
        System.out.print("Enter your initial balance: ");
        return scanner.nextInt();
    }
}
