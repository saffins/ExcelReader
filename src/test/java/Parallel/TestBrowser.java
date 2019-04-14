package Parallel;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser {
	
	@Test
	@Parameters({"browser"})
	public void doLogin(String brow) throws InterruptedException{
		
		Date d = new Date();
		System.out.println("browser : " +brow + " date " + d);
		Thread.sleep(2000);
		
	}

}
