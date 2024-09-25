package SeleniumTestNG;

import org.testng.annotations.Test;

public class TestNGDependencies {
	
	@Test(enabled = true)
	public void highschool() {
		System.out.println("High school");
	}
	@Test(dependsOnMethods = "highschool")
	public void highersecondary() {
		System.out.println("Higher secondary school");
	}
	@Test(dependsOnMethods = "highersecondary")
	public void engineering() {
		System.out.println("college");
	}
}
