package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRadiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
	
		//for identifying default radio buttons
		WebElement selectable = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
	    WebElement unselectable = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/div/div[2]/span"));
		boolean status1 = selectable.isSelected();
		boolean status2 = unselectable.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		
		
		//for clicking radio buttons
		
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[2]/div/div[2]"));
	    radiobutton.click();
	    
	    
	    
	    //for clicking age20
	    
	    WebElement agebelow = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
	    agebelow.click();
	    
	    
	
	}

}
