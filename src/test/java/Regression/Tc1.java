package Regression;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Tc1 {

	@Test(groups={"sanity","smoke"})
	public void m1(){
		Assert.fail();
	}

	@Test(groups="smoke")
	public void m2(){
		System.out.println("Regression package m2 = smoke");
	}
	
	@Test(groups="sanity")
	public void m3(){
		System.out.println("Regression package m3 = smoke");
		Assert.fail();
	}
	
	@Test
	public void m4(){
		
		throw new SkipException("skiped");
		
	}
}
