package OnFail;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNGData.BrowserFactory;

public class Tests extends BrowserFactory {

	
	@Test(invocationCount=5,threadPoolSize=3)
	public void m1(){
		
		BrowserFactory.startBrowser("chrome", "https://google.com");

		System.out.println("hi");
	}
	
	@Test
	public void m2(){
		
		
		//driver.findElement(By.name("q")).sendKeys("hello");
		Assert.fail();
	}
}
