package spring.numberguessgame.core;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageGeneratorImpl implements MessageGenerator {

	// == constants 
	private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);
	
	// == fields ==
	@Autowired
	private Game game;
	
	
	//== init==
	@PostConstruct
	public void init() {
		log.info("=====================");
		log.info("game = {}", game);
		log.info(this.getMainMessage());
	}
	
	@Override
	public String getMainMessage() {
		return "Number is between " + game.getSmallest() + " and " + game.getBiggest() + ". Start ? ";
	}

	@Override
	public String getResultMessage() {
		if(game.isGameWon()) {
			return "Right!, the number is " + game.getNumber();
		} else if(game.isGameLost()) {
			return "Wrong!, the number is " + game.getNumber();
		} else if(!game.isValidNumberRange()) {
			return "Invalid number range";
		} else if(game.getRemainingGuesses() == game.getCount()) {
			return "What is your first guess";
		} else {
			String direction = "Lower! ";
			if(game.getGuess() <  game.getNumber())
				direction = "Higher! ";
			return direction + " You have "  + game.getRemainingGuesses() + " guess(es) left";

		}
		
		
	}

}
