import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountsTest {

    @Test
    public void constructor_maxAccountsTen() {
        Accounts accounts = new Accounts(11, 20.00);
        assertEquals(10, accounts.getMaxAccounts());
    }
}
