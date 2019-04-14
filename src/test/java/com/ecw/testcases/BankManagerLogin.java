package com.ecw.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecw.base.TestBase;

public class BankManagerLogin extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {
		log.debug("inside logintest");
		driver.findElement(By.cssSelector(OR.getProperty("bankManager"))).click();
		Thread.sleep(3000);

		Assert.assertTrue(isPresent(By.cssSelector(OR.getProperty("addCust"))),"login not successful");
		log.debug("add customer is displayed");

	}

}
