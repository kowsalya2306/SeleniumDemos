package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//for clicking checkbox
		WebElement selectbasicbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		selectbasicbox.click();
		
		//for clicking multiple checkbox
		WebElement selectbasicbox1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		selectbasicbox1.click();
		
		WebElement selectbasicbox2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]"));
		selectbasicbox2.click();
		
		//for checking enabled
		WebElement selectbasicbox3 = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		selectbasicbox3.click();
		
		
		//for checking disabled or not checking
		WebElement selectbasicbox4 = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]/div[2]"));
		boolean selectbox = selectbasicbox3.isSelected();
		System.out.println(selectbox);

	}

}
