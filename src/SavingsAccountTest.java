import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SavingsAccountTest {
	
	SavingsAccount savings_obj = null;

	@Before
	public void setUp() throws Exception {
		savings_obj = new SavingsAccount("Joseph travalto", "Moon street", "98765", "Texas", "USA");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSavingsAccount() {
		savings_obj = new SavingsAccount("Joseph travalto", "Moon street", "98765", "Texas", "USA");
		assertNotNull(savings_obj);
	}

	@Test
	public final void testCalculateInterest() {
		
	}

	@Test
	public final void testWithdrawal() {
		savings_obj.fBalance=5000;
		savings_obj.withdrawal(2000);
		assertEquals(5000-2000,savings_obj.fBalance,0);
	}

	@Test
	public final void testVerseMoney() {
		
	}

	@Test
	public final void testPrint() {
		
	}

}
