import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DebitCardTest {

	DebitCard debit_obj = null;
	@Before
	public void setUp() throws Exception {
		
		debit_obj = new DebitCard("Enid Blyton", "Surrey Street", "50000", "Newark", "USA");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testDebitCardStringStringStringStringString() {
		
	}

	@Test
	public final void testDebitCardStringStringStringStringStringDoubleCheckingAccount() {
		
	}

	@Test
	public final void testPay() {
		
	}

}
