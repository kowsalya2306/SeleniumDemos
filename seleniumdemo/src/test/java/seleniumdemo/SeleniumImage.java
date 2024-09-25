package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/broken-images");
		
		WebElement brokenimage = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/img"));
		
		if(brokenimage.getAttribute("naturalwidth").equals("0")) {
			System.out.println("The image is broken");
		}
		else {
			System.out.println("The image is NOT broken");
		}
				
	}

	
}
