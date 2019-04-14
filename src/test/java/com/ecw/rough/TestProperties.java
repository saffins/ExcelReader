package com.ecw.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public static void main(String[] afin) throws IOException{
		
		
		Properties config = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fs);
	
		
	
		
		System.out.println(config.getProperty("browser"));
		
	}

}
