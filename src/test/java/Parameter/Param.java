package Parameter;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {

	@Parameters({"browser","env"})
	@Test
	public void geTest(String name,String env){
		
		Date d = new Date();
		System.out.println(name+ "----" + env + " date " + d);
		
	}
	
}


