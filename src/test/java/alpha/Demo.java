package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		log.debug("i debugging");
		log.info("infomessage");
		log.error("hi");
		log.fatal("fatal");
		
	}

}
