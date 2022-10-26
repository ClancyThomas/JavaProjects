import java.util.concurrent.ThreadLocalRandom;

//
// Class that represents the simulation
//
public class Simulator {

    private Accounts accounts;
    private int exchanges;

    public Simulator(int participants, double startingBalance, int exchanges) {
        this.accounts = new Accounts(participants, startingBalance);
        this.exchanges = exchanges;
    }

    public void startSimulationWithConsole() {
        System.out.println("************ Pre-simulation Report ************");
        accounts.printAllAccountsToConsole();
        this.exchangeMoney();
        System.out.println("************ Post-simulation Report ************");
        accounts.printAllAccountsToConsole();
    }

    public void startSimulationWithTextFile() {
        accounts.printAllAccountsToTextFile("************ Pre-simulation Report ************", false);
        this.exchangeMoney();
        accounts.printAllAccountsToTextFile("************ Post-simulation Report ************", true);
    }

    //
    // Exchange money between random accounts
    //
    private void exchangeMoney() {
        for (int i = 0; i < exchanges; i++) {

            Account one = accounts.getRandomAccount();
            Account two = accounts.getRandomAccount();
            double exchangeAmount = getExchangeAmount(one, two);

            if (ThreadLocalRandom.current().nextBoolean()) {
                one.withdraw(exchangeAmount);
                two.deposit(exchangeAmount);
            } else {
                one.deposit(exchangeAmount);
                two.withdraw(exchangeAmount);
            }
        }
    }

    //
    // Exchange amount will be a random amount that is less than the smallest balance of the two accounts
    //
    private double getExchangeAmount(Account one, Account two) {
        if (one.getBalance() >= two.getBalance()) {
            return ThreadLocalRandom.current().nextDouble(0,two.getBalance());
        } else {
            return ThreadLocalRandom.current().nextDouble(0,one.getBalance());
        }
    }



}
