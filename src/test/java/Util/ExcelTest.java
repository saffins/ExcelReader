package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest {

	@DataProvider(name = "test")
	public Object[][] data() {

		ExcelConfig config = new ExcelConfig(
				"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\excel\\LoginTest.xlsx");
		int row = config.getRowCount(0);

		Object[][] data = {{"test@ec.com","john"},{"tk@k.com","john"}};
 

		return data;
	}
	
	@Test(dataProvider="test")
	public void m1(String name,String pass){
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys(name);
		driver.findElement(By.name("pass")).sendKeys(pass);

	}

}
