package TestNGData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class App {

	
	@Test
	public void login(){
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.google.com");
		
		PageNew pn = PageFactory.initElements(driver, PageNew.class);
		pn.searchBar("automate");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pn.searchBtn();
		
	}
}
