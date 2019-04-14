package TestNGData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BrowserFactory {
	
	public static WebDriver driver;

	public static void startBrowser(String name,String url){
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");

		if(name.equals("firefox")){
			
			driver = new FirefoxDriver();
			
		}else if(name.equals("chrome")){
			
			driver = new ChromeDriver();
		}
		
		driver.navigate().to(url);
		
	

		
	}

}
