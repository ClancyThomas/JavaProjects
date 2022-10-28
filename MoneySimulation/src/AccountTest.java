import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

    @Test
    public void constructor_startWithFive() {
        Account account = new Account(5);
        assertEquals(5, account.getBalance(), .01);
    }

    @Test
    public void deposit_addFive() {
        Account account = new Account(0);
        account.deposit(5);
        assertEquals(5, account.getBalance(), .01);
    }

    @Test
    public void withdraw_takeFive() {
        Account account = new Account(10);
        account.withdraw(5);
        assertEquals(5, account.getBalance(), .01);
    }

    @Test
    public void toString_takeFive() {
        Account account = new Account(10);
        assertEquals("$10.00\n", account.toString());
    }


}
