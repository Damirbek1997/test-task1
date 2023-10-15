public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double debit(double amount) {
        if (balance < amount) {
            amount = balance;
        }

        balance -= amount;
        return amount;
    }
}
