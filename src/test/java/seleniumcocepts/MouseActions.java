package seleniumcocepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int n = links.size();
				System.out.println("no of links is"+links.size());
		for (int i = 0; i <n ; i++) {
			System.out.println("name of link is"+links.get(i).getText());
			
		}
		

		/*
		 * Actions mouse = new Actions(driver);
		 * mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
		 * .sendKeys("electronics").build().perform();
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */

	}

}
