package SeleniumTestNG;

import java.sql.Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGBeforeAfterAnnotations {
	WebDriver driver;
	long starttime;
	long endtime;
	
	  //Aim: open chrome to go
	  //1.google.co.in 2.bing.co.in  3.yahoo.co.in
	@BeforeSuite
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTraining\\chromedriver-128\\chromedriver.exe");
		 driver = new ChromeDriver();
		 starttime = System.currentTimeMillis();
	}
	
	@Test
	public void opengoogle() {
		driver.get("https://www.google.co.in/");
		
	}
	@Test
	public void openbing() {
		driver.get("https://www.bing.co.in/");

	}
	@Test
	public void openyahoo() {
		driver.get("https://www.yahoo.co.in/");
	}
	
	@AfterSuite 
		public void closebrowser() {
			driver.quit();
		    endtime = System.currentTimeMillis();
			long totaltime = endtime-starttime;
			System.out.println("total tile of browser:"+totaltime);
		}
		
		
		
	}

