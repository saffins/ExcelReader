package TestNGData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@Test
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		POM p = new POM(driver);
		p.search("automation");
		p.btn();
	}

	 

	
	 
	public void loginTest() {

		
	((JavascriptExecutor)driver).executeScript("document.getElementById('demo').innerHTML = Date()");
		
	}

	@AfterMethod
	public void tearDown() {

		//driver.quit();

	}

}
