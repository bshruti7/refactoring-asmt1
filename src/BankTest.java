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
public class BankTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		//BankTest bt1=new BankTest();
		//bt1.testBank();
		//bt1.testOpenSimpleCheckingAccount();
		//bt1.testOpenFullPackage();
		//bt1.testWithdrawMoney();
		
		//Bank bank5 = new Bank("Bank of A");
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Bank#Bank(java.lang.String)}.
	 */
	@Test
	public final void testBank() {
		Bank bank1 = new Bank("Wells Fargo");
		assertNotNull("The object bank1 is not created and is still null", bank1);
		Bank bank2=null;
		assertNull("The object bank2 is not created and is still null", bank2);
		
		
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link Bank#openSimpleCheckingAccount()}.
	 */
	@Test
	public final void testOpenSimpleCheckingAccount() {
		Bank bank3 = new Bank ("Bank of A");
		assertNotNull("The object bank1 is not created and is still null", bank3);
		
		
		int accnum=bank3.openSimpleCheckingAccount();
		
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link Bank#openFullPackage()}.
	 */
	@Test
	public final void testOpenFullPackage() {
	//	fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link Bank#withdrawMoney(int, double)}.
	 */
	@Test
	public final void testWithdrawMoney() {
		Bank bank6 = new Bank("Bank of D");
		int acNum6=bank6.openSimpleCheckingAccount();
		
		assertEquals("Withdraw Money is working correctly", true, bank6.withdrawMoney(acNum6, 3000));
		assertNotEquals("Withdraw Money is not "
				+ "working correctly", true, bank6.withdrawMoney(acNum6, 4000));
		//fail("Not yet implemented"); // TODO
	}

}
