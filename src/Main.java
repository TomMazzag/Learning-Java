import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method called");
        System.out.println(args[0]);
        Bank usersBank = new Bank(10);
        usersBank.deposit(14);

        usersBank.spend(20);
    }
}
