package Util;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import TestNGData.BrowserFactory;

public class getScreenshot extends BrowserFactory{
	
	@Test
	public static String capture(String name){
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		int i = 1;
		String dest = "D:\\bf44\\"+name+i+".jpg";
		File destination = new File(dest);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		i++;
		return dest;
	}

}
