package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		//for clicking alert
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		alertbox.click();
		Alert alert = driver.switchTo().alert();  //Alert is an interface
		alert.accept();


		//for confirm button
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		confirmbox.click();
		Alert confirmboxbutton = driver.switchTo().alert();
		confirmboxbutton.accept();
		
		//for textbox button
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		textbox.click();
		Alert textboxtext = driver.switchTo().alert();
		textboxtext.sendKeys("kowsalya");
		textboxtext.accept();
		
	}
	

}
