import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BankTest {
    @Test
    public void testFunds() {
        Bank bank = new Bank(10);
        double amount = bank.debit(5);
        assertEquals(5.0, amount);
    }
}
