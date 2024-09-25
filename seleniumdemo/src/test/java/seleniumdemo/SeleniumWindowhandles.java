package seleniumdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
	    editbox.click();
	    
	     Set<String> handles = driver.getWindowHandles();
	     
	     for (String newwindow : handles) {
	    	 
	    	 driver.switchTo().window(newwindow);
		}
	    
	     WebElement newwindow = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a/i[1]"));
	     newwindow.click();
	     
	    // for quiting the browser we use quit method(it closes all the browsers)
	  //  driver.quit(); 
	    //for close the browser we use close method(it closes current browser)
	    //  driver.close();
	     //it move to the old window
	     driver.switchTo().window(oldwindow);
	     
	     WebElement multiplewindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
	     multiplewindow.click();
	     
	     int multiplewindowsize = driver.getWindowHandles().size();
	     System.out.println("Number of windows :"+ multiplewindowsize);
	     
	     
	     //closes all windows except parent window
	     
	   WebElement closewindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
	   closewindows.click();
	   
	   Set<String> newwindows = driver.getWindowHandles();
	   for (String allwindows : newwindows) {
		  if(!allwindows.equals(oldwindow)) {
				  driver.switchTo().window(allwindows);
				  driver.close();
	
		
	}  
	     
	    
	}

}}