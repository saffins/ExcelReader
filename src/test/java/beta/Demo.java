package beta;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		for(int i = 1; i<= 5;i++){
			
			for(int j = 1;j<=i; j++){
				
				System.out.print(j);
				
			}
			
			System.out.println();
			
		}
	}

}
