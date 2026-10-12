public class Main {
    public static void main(String[] args) {
        System.out.println("Main method called");
        System.out.println(args[0]);

        String name = UserInput.askName();
        int initialBalance = UserInput.askInitialBalance();

        Bank usersBank = new Bank(initialBalance, name);
        usersBank.deposit(5);

        usersBank.spend(20);

    }
}
