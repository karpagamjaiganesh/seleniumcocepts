package testngconcepts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Test_Annotation_Priority {
	
	 WebDriver driver;
	By signUplink = By.linkText("Sign Up");
	By username = By.id("username");
	By pwd = By.id("password");
	By loginbtn = By.xpath("//button[@type(),'submit']");
	String actualTitle = "Log in to your account";
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=megamenu&ut_source=homepage&ut_source3=megamenu");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}	
	
@AfterMethod
public void teardown() {
	driver.quit();
}
@Test(priority=1)
public void signUpLink() {
	System.out.println("sign up link is available");
	driver.findElement(signUplink).isDisplayed();
}
@Test(priority=2)
public void verifyTitle() {
	
	String curTitle =driver.getTitle();
	System.out.println("title is "+curTitle);
   Assert.assertEquals(curTitle, actualTitle);
   System.out.println("title is matching");
}
}
