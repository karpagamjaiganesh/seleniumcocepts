package seleniumcocepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc001_xpathconcepts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();// to use chrome
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	   // driver.findElement(By.linkText("Gift Cards")).click();
	   // List<WebElement> e= driver.findElements(By.partialLinkText("Gift Ide"));
	  //driver.findElement(By.xpath("//span[contains(text(),'French')]")).click();
	    
	   
	    
	   // List<WebElement> e= driver.findElements(By.linkText("Gift Cards"));
	    //System.out.println("no.of elements"+e.size());
	    
	   //driver.findElement(By.id("twotabsearchtextbox")).click();
	   driver.findElement(By.cssSelector("span.hm-icon-label")).click();
	   driver.findElement(By.cssSelector("div#nav-sprite hmenu-close-icon")).click();
	   /* driver.findElement(By.partialLinkText("Amazon Music")).click();
	    driver.findElement(By.partialLinkText("Prime Music")).click();	
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
	    
	  // driver.findElement(By.partialLinkText("Dont")).click();
	    
	  
		driver.findElement(By.cssSelector("div.nav-sprite hmenu-close-icon")).click();	   
	    driver.findElement(By.partialLinkText("Registry")).click();
	    Select s = new Select(driver.findElement(By.partialLinkText("Select a registry or gift list type")));
	    s.selectByVisibleText("Baby Registry");
	   
	   
	}
}
