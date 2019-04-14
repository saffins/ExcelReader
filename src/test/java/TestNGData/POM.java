package TestNGData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM extends LoginTest {
	
	By searchBar = By.name("q");
	
	By searchBtn = By.name("btnK");
	
	WebDriver driver;

	public POM(WebDriver driver){
		
		this.driver = driver;
		
	}

	public void search(String text){
		
		driver.findElement(searchBar).sendKeys(text);
	}
	
	public void btn(){
		
		driver.findElement(searchBtn).click();
		
	}
}
