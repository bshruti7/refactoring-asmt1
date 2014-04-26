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
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCalculateInterest() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testWithdrawal() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testVerseMoney() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testPrint() {
		fail("Not yet implemented"); // TODO
	}

}
