package OnFail;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestNGData.BrowserFactory;

public class TestUtil extends BrowserFactory {

	public static String path;
	
	public static void capture(String item){
		int j = 0;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			path = System.getProperty("user.dir")+"\\ss\\"+item+".jpg";

			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
