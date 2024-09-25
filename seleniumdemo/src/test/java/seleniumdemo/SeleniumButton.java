package seleniumdemo;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		
	/*	WebElement getPositionButton = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt94']/span[2]"));
		Point xypoint = getPositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		*/
		
		//find background color
		WebElement backgroundColorButton = driver.findElement(By.id("//*[@id='j_idt88:j_idt96']/span[2]"));
		String color = backgroundColorButton.getCssValue("background color");
		System.out.println("Button color is :"+color);
		
		
		
        		

	}

}
