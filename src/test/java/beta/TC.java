package beta;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC {
	

	@Test(priority=1)
	public void m1(){
		System.out.println("registered");
		Assert.fail("unable to register");
	}
	
	@Test(priority=2,dependsOnMethods="m1",alwaysRun=true)
	public void m2(){
		System.out.println("executing login");
	}
	
	@Test(priority=3,dependsOnMethods="m1",alwaysRun=true)
	public void m3(){
		System.out.println("executing ");
		 
	}
	
	@Test(priority=4 ,dependsOnMethods="m1")
	public void m4(){
		System.out.println("executing 4");
	
	}
	
	
	
}
