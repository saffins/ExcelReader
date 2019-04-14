package Parallel;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider="getData")
	public void doLogin(String brow) throws InterruptedException{
		
		Date d = new Date();
		System.out.println("browser : " +brow + " date " + d);
		Thread.sleep(2000);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[2][1];
		
		data[0][0] = "chrome";
		data[1][0] = "firefox";
		
		return data;
		
	}
	

}
