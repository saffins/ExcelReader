package TestNGData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageNew {
	
	public PageNew(){
		
		
		
	}
	
	
	@FindBy(name="q") 
	@CacheLookup
	WebElement searchBar;
	
	@FindBy(how=How.NAME,using="btnK") 
	@CacheLookup
	WebElement searchBtn;
	
	public  void searchBar(String data){
		
		searchBar.sendKeys(data);
		
	}
	
	public void searchBtn(){
		
		searchBtn.click();
		
	}
	

}
