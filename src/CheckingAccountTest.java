import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Shruti
 *
 */
public class CheckingAccountTest {

	CheckingAccount newAccount = null;// new CheckingAccount("Jane Austen", "150th Ave.", "16765", "Bellevue", "USA");
	CheckingAccount otherAccount = null;
	
	@Before
	public void setUp() throws Exception {
		newAccount = new CheckingAccount("Jane Austen", "150th Ave.", "16765", "Bellevue", "USA");
		otherAccount = new CheckingAccount("Ross Walden", "Pacific Street", "10734", "Redmond", "USA", 5000);
	}

	
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link CheckingAccount#CheckingAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testCheckingAccountStringStringStringStringString() {
		
		CheckingAccount Account1 = new CheckingAccount("Ross Walden", "Pacific Street", "10734", "Redmond", "USA");
		assertNotNull(Account1);
		
	}

	/**
	 * Test method for {@link CheckingAccount#CheckingAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float)}.
	 */
	@Test
	public final void testCheckingAccountStringStringStringStringStringFloat() {
		
		CheckingAccount Account2 = new CheckingAccount("Ross Walden", "Pacific Street", "10734", "Redmond", "USA", 5000);
		assertNotNull(Account2);
	}

	/**
	 * Test method for {@link CheckingAccount#CheckingAccount(int)}.
	 */
	@Test
	public final void testCheckingAccountInt() {
		CheckingAccount validateAccount = new CheckingAccount(123456);
		assertEquals(123456,validateAccount.getAccountNumber(),0);
	}

	/**
	 * Test method for {@link CheckingAccount#determineCosts()}.
	 */
	@Test
	public final void testDetermineCosts() {
		
		//testing when the balance is 0 - not set
		double initialBal=newAccount.getBalance();
		newAccount.determineCosts();
		double accBal = newAccount.getBalance();
		double expectedBal = (initialBal-1) - ((initialBal-1) * 4.7 / 100);
		assertEquals(expectedBal, accBal, 0);
		
		//testing when the balance is set
		newAccount.setBalance(4000);
		double initialBal1=newAccount.getBalance();
		newAccount.determineCosts();
		double accBal1 = newAccount.getBalance();
		assertEquals(initialBal1,accBal1,1);
		
	}

	/**
	 * Test method for {@link CheckingAccount#print()}.
	 */
	@Test
	public final void testPrint() {
		
	}

	/**
	 * Test method for {@link CheckingAccount#withdrawal(double)}.
	 */
	@Test
	public final void testWithdrawal() {
		newAccount.setBalance(5000);
		double initialBal=newAccount.getBalance();
		newAccount.withdrawal(2500);
		double accBal = newAccount.getBalance();
		double expectedBal = (initialBal-2500);
		assertEquals(expectedBal, accBal, 0);
	}

	/**
	 * Test method for {@link CheckingAccount#verseMoney(double)}.
	 */
	@Test
	public final void testVerseMoney() {
		newAccount.setBalance(5000);
		double initialBal=newAccount.getBalance();
		newAccount.verseMoney(2500);
		double accBal = newAccount.getBalance();
		double expectedBal = (initialBal+2500);
		assertEquals(expectedBal, accBal, 0);
	}

	/**
	 * Test method for {@link CheckingAccount#applyForCreditCard(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public final void testApplyForCreditCard() {
		newAccount.setBalance(1000);
		boolean result = newAccount.applyForCreditCard("Hilary Chelsea", "Marvel Way", "98989", "Frankfurt", "USA", newAccount.getAccountNumber());
		assertEquals(true, result);
		
		//testing another branch
		newAccount.setBalance(5000);
		boolean result1 = newAccount.applyForCreditCard("Hilary Chelsea", "Marvel Way", "98989", "Frankfurt", "USA", newAccount.getAccountNumber());
		assertEquals(true, result1);
		
	}

	/**
	 * Test method for {@link CheckingAccount#getBalance()}.
	 */
	@Test
	public final void testGetBalance() {
		newAccount.setBalance(6000);
		assertEquals(6000,newAccount.getBalance(),0);
		
		
	}

	/**
	 * Test method for {@link CheckingAccount#increaseBalance(double)}.
	 */
	@Test
	public final void testIncreaseBalance() {
		newAccount.setBalance(5000);
		double initialBal=newAccount.getBalance();
		newAccount.increaseBalance(2500);
		double accBal = newAccount.getBalance();
		double expectedBal = (initialBal+2500);
		assertEquals(expectedBal, accBal, 0);
	}

	/**
	 * Test method for {@link CheckingAccount#decreaseBalance(double)}.
	 */
	@Test
	public final void testDecreaseBalance() {
		newAccount.setBalance(5000);
		double initialBal=newAccount.getBalance();
		newAccount.decreaseBalance(2500);
		double accBal = newAccount.getBalance();
		double expectedBal = (initialBal-2500);
		assertEquals(expectedBal, accBal, 0);
		
	}

	/**
	 * Test method for {@link CheckingAccount#getDebitAmount()}.
	 */
	@Test
	public final void testGetDebitAmount() {
		double debitReturned = newAccount.getDebitAmount();
		assertEquals(0, debitReturned, 0);
		double debitReturned1 = otherAccount.getDebitAmount();
		assertEquals(5000, debitReturned1, 0);
		
	}

	/**
	 * Test method for {@link CheckingAccount#setBalance(double)}.
	 */
	
	@Test
	public final void testSetBalance() {
		newAccount.setBalance(5000);
		assertEquals(5000, newAccount.getBalance(), 0);
		
	}

	/**
	 * Test method for {@link CheckingAccount#getAccountNumber()}.
	 */
	@Test
	public final void testGetAccountNumber() {
		CheckingAccount newAccount1 = new CheckingAccount(8978);
		int checkingAccountNum = newAccount1.getAccountNumber();
		assertEquals(8978, checkingAccountNum, 0);
	}

	/**
	 * Test method for {@link CheckingAccount#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {
		
		CheckingAccount oneAccount = new CheckingAccount(1234);
		CheckingAccount secondAccount = new CheckingAccount(1234);
		assertEquals(true, oneAccount.equals(secondAccount));
		
		
		//checking other branch
		CheckingAccount oneAccount1 = new CheckingAccount(1234);
		CheckingAccount secondAccount2 = new CheckingAccount(5678);
		assertEquals(false, oneAccount1.equals(secondAccount2));
	}

}
