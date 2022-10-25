public class Account {

    private double balance;

    public Account(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "$"+balance;
    }
    
}
