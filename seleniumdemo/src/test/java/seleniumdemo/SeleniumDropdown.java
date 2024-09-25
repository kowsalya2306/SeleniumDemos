package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node0sbg1uy2fcso1dy64461zu3ui5273611.node0");
       
		
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);  //using index 
       select.selectByValue("2");  //using value
       select.selectByVisibleText("Selenium");    //using visible text
       
       //for multiselector
       
       WebElement multiselect = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select"));
       Select multiselectbox = new Select(multiselect);
       multiselectbox.selectByIndex(1);
       multiselectbox.selectByIndex(2);
       multiselectbox.selectByIndex(3);
       
       
       
       //for number of dropdown options
       
       List<WebElement> listofoptions = select.getAllSelectedOptions();
       int size =  listofoptions.size();
       System.out.println("Number of elements = "+size);

        
        
        
       
}
}