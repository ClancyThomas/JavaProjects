//
// Basic class that represents a bank account
//
public class Account {

    private double balance;

    public Account(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    //
    // Override toString in order to easily print an account
    //
    @Override
    public String toString() {
        return String.format("$%.2f %n",balance);
    }
    
}
