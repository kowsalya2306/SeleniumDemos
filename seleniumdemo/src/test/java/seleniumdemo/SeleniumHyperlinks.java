package seleniumdemo;
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHyperlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0"); //using navigate method for back forward options
		
		
		 WebElement gotodashboard =driver.findElement(By.linkText("Go to Dashboard")); //1
		  gotodashboard.click(); driver.navigate().back();
		 
		 WebElement wheretogo = driver.findElement(By.partialLinkText("Find the"));//2
		 String where = wheretogo.getAttribute("href");
		 System.out.println("This is going in the location: "+where);
		 
		 WebElement brokenlink = driver.findElement(By.linkText("Broken?"));//3
		 String findbroken =   driver.getTitle();
		 if(findbroken.contains("404")) {
			System.out.println("link is broken");
		 }
		 driver.navigate().back();
		 Thread.sleep(4000);
		 
		 
		 WebElement gotodashboard1 = driver.findElement(By.linkText("Go to Dashboard")); //4
		 gotodashboard1.click();
		 driver.navigate().back();
		 
		 
		 List<WebElement> linkcount = driver.findElements(By.linkText("How many links in this page?")); //5
		 int countlink = linkcount.size();
		
				 

	}

}
