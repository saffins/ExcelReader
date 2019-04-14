package Parallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestNGData.BrowserFactory;

public class TestInvocation extends BrowserFactory{

	@Test(invocationCount=5,threadPoolSize = 5)
	public void execute(){
		
		 BrowserFactory.startBrowser("chrome", "https://google.com");
		
		System.out.println("hi");
		driver.quit();
		
	}
	
}
