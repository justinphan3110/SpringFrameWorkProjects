package spring.numberguessgame.core.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {
	// == Fields ==
	@Value("${game.MaxNumber: 50}")
	private int MAX;
	
	@Value("${game.GuessCount: 10}")
	private int guessCount;
	
	@Value("${game.MinNumber}")
	private int MIN;
	// == Method
	@Bean
	@MinNumber
	public int getMin() {
		return MIN;
	}
	
	@Bean
	@MaxNumber
	public int getMax() {
		return MAX;
	}
	@Bean
	@GuessCount
	public int getGuessCount() {
		return guessCount;
	}
}
