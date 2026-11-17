import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testThatIhaveAnAccountItIsZero_IDeposit5000_MyBalanceIs5000() {
        Account account = new Account();
        assertFalse(account.checkaccount());

        account.deposit(5000);

        assertEquals(5000, account.getBalance());
    }

    @Test
    public void testThatIhaveAnAccountWith5000Balance_IWithdraw2000_MyBalanceIs3000() {
        Account account = new Account(5000);

        account.withdraw(2000);

        assertEquals(3000, account.getBalance());
    }
}




