package com.ecw.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ecw.utilities.ExcelReader;

public class TestBase {

	/*
	 * Webdriver Properties Logs Extent report db excel Mail, report ng , extent report, jenkins
	 * 
	 */

	public  WebDriver driver;
	public  Properties config = new Properties();
	public  Properties OR = new Properties();
	public  FileInputStream fis;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	public static ExcelReader excel = new ExcelReader("C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\excel\\document.xlsx");

	@BeforeSuite
	public void setUp() throws IOException {

		if (driver == null) {

			FileInputStream fs = new FileInputStream(
					"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\properties\\Config.properties");
			config.load(fs);
			FileInputStream fs1 = new FileInputStream(
					"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fs1);

		}

		if (config.getProperty("browser").equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "gecko.exe");
			driver = new FirefoxDriver();
			log.debug("firefox launched");
			

		} else if (config.getProperty("browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\JavaWorkspace\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("chrome launched");


		}

		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterSuite
	public void tearDown() {

		if (driver != null) {

			driver.quit();
			log.debug("driver quit");
		}
	}
	
	public boolean isPresent(By by){
		
		try{
			
			driver.findElement(by);
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
		
	}

}
