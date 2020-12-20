package seleniumcocepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_PCF {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	  driver.get("https://www.pcfinancial.ca/en/");
	  driver.findElement(By.xpath("//button[contains(text(),'Apply now')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Open account')]")).click();
	 Thread.sleep(2000);
	  
	  driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Get started')]")).click();
	driver.close();  
	}
	

}
