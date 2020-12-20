package seleniumcocepts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();// to use chrome
	    driver = new ChromeDriver();
	    
	 /*   driver.get("https://www.amazon.ca/");
	    // File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //  FileUtils.copyFile(srcFile, new File("./target/screenshot/login.png"));
	    //WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
	    Thread.sleep(3000);
	    //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("electronics");
	   //File srcFile1 = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	   //FileUtils.copyFile(srcFile1, new File("./target/screenshot/firstelement.png"));
	  // driver.findElement(By.xpath("//input[@type='submit']"));
	  
	     driver.findElement(By.cssSelector("span.hm-icon-label")).click();
	    driver.findElement(By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[2]/a[1]")).click();
	    List<WebElement>images=driver.findElements(By.tagName("img"));
	    int imagescount = images.size();
	    System.out.println("no of images are"+imagescount);
	   System.out.println(images.get(3).getAttribute("src"));*/
	    	
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Create New Account")).click();
	   
	}

}
