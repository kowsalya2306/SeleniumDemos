package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class SeleniumTutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //chromedriver is an object it is saved in the driver
	    driver.get("http://www.google.co.in");
	    driver.findElement(By.className("gLFyf")).sendKeys("Apple" +Keys.ENTER);
	   //driver.findElement(By.linkText("iPhone 15 Pro")).click();
	
	 //  driver.close(); 

	   
	}
	
	
	
}
