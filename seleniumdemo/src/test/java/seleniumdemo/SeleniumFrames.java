package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumTraining\\\\chromedriver-127\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node01me8nbs5i048wgtlcm05gshe15613272.node0");
		
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
	
		//2nd frame
		
		driver.switchTo().defaultContent(); //important line
		driver.switchTo().frame(1);
		
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		
		//3rd frame
		driver.switchTo().defaultContent();
		
		 List<WebElement> count=driver.findElements(By.tagName("iframe"));//using findelements not findelement
		 int allframes = count.size();                  //impt
		 System.out.println(allframes);
        
		
		 

	}

}
