import java.util.concurrent.ThreadLocalRandom;

public class Simulator {

    private Accounts accounts;
    private int exchanges;

    public Simulator(int participants, double startingBalance, int exchanges) {
        this.accounts = new Accounts(participants, startingBalance);
        this.exchanges = exchanges;
    }

    public void startSimulation() {
        System.out.println("************ Pre-simulation Report ************");
        accounts.printAllAccounts();
        this.exchangeMoney();
        System.out.println("************ Post-simulation Report ************");
        accounts.printAllAccounts();
    }

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

    private double getExchangeAmount(Account one, Account two) {
        if (one.getBalance() >= two.getBalance()) {
            return ThreadLocalRandom.current().nextDouble(0,two.getBalance());
        } else {
            return ThreadLocalRandom.current().nextDouble(0,one.getBalance());
        }
    }



}
