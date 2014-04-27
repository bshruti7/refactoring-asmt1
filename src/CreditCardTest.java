import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreditCardTest {

	
	CreditCard credit_obj = null;
	CreditCard credit_obj_ownLimit = null;
	
	@Before
	public void setUp() throws Exception {
		credit_obj = new CreditCard("Joe Mascarena", "commerce street", "puyallup", "90898", "USA");
		credit_obj_ownLimit = new CreditCard("Maddy Roe", "terence street", "leavenworth", "89898", "USA",6000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCreditCardStringStringStringStringString() {
		
		
	}

	@Test
	public final void testCreditCardStringStringStringStringStringDouble() {
		
	}

	@Test
	public final void testPay() {
		boolean decision = credit_obj.pay(3000);
		assertEquals(true, decision);
		
	}

}
