public class Bank {
    int balance = 0;

    public Bank(int initialBalance) {
        balance = initialBalance;
    }

    private void addMoney(int amount) {
        balance += amount;
    }

    public void deposit(int amount) {
        addMoney(amount);
        System.out.println("Updated balance: " + balance);
    }

    public void spend(int amount) {
        if (checkUserHasBalance(amount)) {
            System.out.println("You do not have enough money in your account");
            return;
        }

        balance -= amount;
        System.out.println("Updated balance: " + balance);
    }

    private boolean checkUserHasBalance(int amountToSpend) {
        return amountToSpend > balance;
    }
}

