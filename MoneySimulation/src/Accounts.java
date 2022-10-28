import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

//
// Class that represents a list/group of bank accounts and contains ability to print the accounts
//
public class Accounts {

    private int maxAccounts;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Accounts(int numOfAccounts, double startingBalance) {
        this.maxAccounts = numOfAccounts-1;

        // Add each account to the list of account
        for (int i=0; i<numOfAccounts; i++) {
            Account temp = new Account(startingBalance);
            accounts.add(temp);
        }
    }

    public int getMaxAccounts() {
        return maxAccounts;
    }

    //
    // Select a random account from all the accounts
    //
    public Account getRandomAccount() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, maxAccounts+1);
        return accounts.get(randomNum);
    }

    public void printAllAccountsToConsole() {
        for(int i=0; i<=maxAccounts; i++) {
            System.out.printf("%d. "+accounts.get(i), i+1);
        }
    }

    public void printAllAccountsToTextFile(String description, boolean append) {
        String fileName = "results.csv";

        try {
            File printFile = new File(fileName);
            if (printFile.createNewFile()) {
                System.out.println("New file created "+printFile.getName());
            } else {
                System.out.println("This file already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating a file!");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(fileName, append);
            fileWriter.write(description+"\n");
            for(int i=0; i<=maxAccounts; i++) {
                fileWriter.write(String.format("%d. "+accounts.get(i), i+1));
            }
            fileWriter.close();
            System.out.println("Finished a successful write to the text file.");
        } catch (IOException e) {
            System.out.println("An error occurred trying to write to the file!");
            e.printStackTrace();
        }
    }

}
