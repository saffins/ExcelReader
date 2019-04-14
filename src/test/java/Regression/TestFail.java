package Regression;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestFail {
	
	@Test
	public void doLogin(){
		
		Assert.fail("failing");
		
	}

}
