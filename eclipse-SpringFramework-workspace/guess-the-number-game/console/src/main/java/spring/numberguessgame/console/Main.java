package spring.numberguessgame.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.numberguessgame.core.MessageGenerator;
import spring.numberguessgame.core.NumberGenerator;
import spring.numberguessgame.core.configuration.AppConfig;



public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	private static final String BEAN_LOCATION = "beans.xml";
	
	public static void main(String[] args) {
		log.info("aaaa");
		
		// create context (container)
		// get number bean from context
		ConfigurableApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	}
	
}
