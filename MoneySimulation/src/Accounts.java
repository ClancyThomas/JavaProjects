import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Accounts {

    private int maxAccounts;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Accounts(int numOfAccounts) {
        this.maxAccounts = numOfAccounts - 1;

        for (int i=0; i<numOfAccounts-1; i++) {
            Account temp = new Account();
            accounts.add(temp);
        }
    }

    public Account getRandomAccount() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, maxAccounts);
        return accounts.get(randomNum);
    }

}
