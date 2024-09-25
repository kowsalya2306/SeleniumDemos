package SeleniumTestNG;

import java.security.PublicKey;

import org.testng.annotations.Test;

public class TestNGSkipcase {
	
	@Test(priority = 5,enabled = false)     //if we give enabled false the testcase will be skipped
	public void turnonmusic() {
		System.out.println("Music Turned ON");
	}

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
