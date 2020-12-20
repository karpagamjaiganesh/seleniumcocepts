package testngconcepts;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_browserOpening {
	  WebDriver driver;
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=megamenu&ut_source=homepage&ut_source3=megamenu");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@Test(invocationCount=5)
	public void invoke()
	{
		String name = RandomStringUtils.randomAlphanumeric(5);
		System.out.println(name);
	}

}
