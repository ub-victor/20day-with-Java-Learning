package logging;
import java.util.logging.*;

public class SimpleLogging {
	
	public static void main(String[] args) {
//		Create a Logger with a class name SimpleLogging
		Logger logger = Logger.getLogger(SimpleLogging.class.getName());
//		Call info method
		logger.info("Message 1");
		logger.info("Message 2");
	
	}
	
}
