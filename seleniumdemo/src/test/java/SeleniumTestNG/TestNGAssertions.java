package SeleniumTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {          //writing assertions instead of if,else condition
	
	String name = "kows";
	boolean value = true;
	
	@Test
	public void TestingEquals() {
		
		Assert.assertEquals(name, "kows");
		Assert.assertNotEquals(name, "CHARU");
	    Assert.assertTrue(value, "true");
	}

}
