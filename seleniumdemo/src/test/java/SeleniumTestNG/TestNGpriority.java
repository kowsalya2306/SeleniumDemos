package SeleniumTestNG;

import org.testng.annotations.Test;
//priority decide the order of sequence
public class TestNGpriority {
	
	@Test(priority = 0)
	public void startthecar() {	
    System.out.println("Start the car");		
	}
	
	@Test(priority = 1)
	public void putfirstgear() {
		System.out.println("First gear");
	}
	
	@Test(priority = 2)
	public void putsecondgear() {
		System.out.println("Second gear");
	}
	
	@Test(priority = 3)
	public void putthirdgear() {
		System.out.println("third gear");
	}

	@Test(priority = 4)
	public void putfourthgear() {
		System.out.println("Fourth gear");
	}

}
