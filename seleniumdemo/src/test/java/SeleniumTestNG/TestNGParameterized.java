package SeleniumTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGParameterized {
	
	@Test
	@Parameters("Name")
     public void Printname(String name) {
		System.out.println("The name is" + name);
	}
}
