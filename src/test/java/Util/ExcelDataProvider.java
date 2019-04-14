package Util;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNGData.BrowserFactory;

public class ExcelDataProvider extends BrowserFactory{
	
	@Test(dataProvider="getData")
	public void test1(String name, String lname, String email,String pass){
	
		BrowserFactory.startBrowser("chrome", "https://www.facebook.com");
		
		/*driver.findElement(By.name("email")).sendKeys(name);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");*/
		
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
		driver.findElement(By.name("websubmit")).click();

		

		
		
		//System.out.println("name " + name + " pass " + pass + " fullname " + fullname);
		
	}
	
	
	@DataProvider(parallel=true)
	public Object[][]  getData(){
		
		String path = "C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\excel\\registration.xlsx";
		
		Object data[][]  = testData(path);
		return data;
		
	}
	
	
	public  Object[][] testData(String path) {

		App excel = new App(path);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();
		
		System.out.println("rows are " + rowCount);
		
		Object[][] data =  new Object[rowCount-1][colCount];
		
		for(int i = 1; i<rowCount; i++){
			
			for(int j = 0; j<colCount; j++){
				
				String cellData = excel.getDataString(i, j);
				data[i-1][j] = cellData;
				
			}
			
		}
		
		return data;
		
	}

	@AfterMethod
	public void quit(){
		
		driver.close();
	}
}
