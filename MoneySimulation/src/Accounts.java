import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Accounts {

    private int maxAccounts;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Accounts(int numOfAccounts, double startingBalance) {
        this.maxAccounts = numOfAccounts-1;

        for (int i=0; i<numOfAccounts; i++) {
            Account temp = new Account(startingBalance);
            accounts.add(temp);
        }
    }

    public Account getRandomAccount() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, maxAccounts+1);
        return accounts.get(randomNum);
    }

    public void printAllAccounts() {
        for(int i=0; i<=maxAccounts; i++) {
            System.out.printf("%d. "+accounts.get(i), i+1);
        }
    }

}
