package spring.numberguessgame.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.numberguessgame.core.Game;
import spring.numberguessgame.core.GameImpl;
import spring.numberguessgame.core.MessageGenerator;
import spring.numberguessgame.core.MessageGeneratorImpl;
import spring.numberguessgame.core.NumberGenerator;
import spring.numberguessgame.core.NumberGeneratorImpl;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "spring.numberguessgame")
public class AppConfig {

	
	}


