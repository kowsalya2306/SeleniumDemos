package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\SeleniumTraining\\\\chromedriver-127\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		
		WebElement emailbox = driver.findElement(By.id("j_idt88:name"));
		emailbox.sendKeys("test@google.com");
		
		WebElement appendbox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendbox.sendKeys("testing");
		
		WebElement clearbox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearbox.clear();
		
		WebElement disabledbox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled);
		
		WebElement retrivetext = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = retrivetext.getAttribute("value");
		System.out.println("value");
		
		
		
		
		


	}

}
