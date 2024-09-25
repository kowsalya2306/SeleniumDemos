package seleniumdemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDownloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver-127\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node01cl5ky03msonx1odcynujlgvio5672704.node0");
		
		WebElement downloadtext = driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));
		downloadtext.click();  //file will be download
		
		//want to check the file location 
		
		//Downloads
		
		Thread.sleep(4000);
        
		File filelocation = new File("Downloads");           //object created
		File[] totalfiles = filelocation.listFiles();
		
		for (File file : totalfiles) {
			if(file.getName().equals("TestLeaf Logo")) {
					System.out.println("file exists");
					break;
			}
		}}}

