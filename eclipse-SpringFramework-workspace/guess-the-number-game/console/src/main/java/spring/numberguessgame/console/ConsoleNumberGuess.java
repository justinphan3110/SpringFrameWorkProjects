package spring.numberguessgame.console;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import spring.numberguessgame.core.Game;
import spring.numberguessgame.core.MessageGenerator;

@Component
public class ConsoleNumberGuess {
	//== constants == 
	private static final Logger  log = LoggerFactory.getLogger(ConsoleNumberGuess.class);
	
	// == Fields == 
	@Autowired
	private Game game;
	
	@Autowired
	private MessageGenerator messageGenerator;
	@EventListener(ContextRefreshedEvent.class)
	public void start() {
		log.info("Start -----> Container ready");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(messageGenerator.getMainMessage());
			System.out.println(messageGenerator.getResultMessage());
			
			int guess = scan.nextInt();
			scan.nextLine();
			game.setGuess(guess);
			game.check();
			
			if(game.isGameWon() || game.isGameLost()) {
				System.out.println(messageGenerator.getResultMessage());
				System.out.println("Play again (y/n) ? ");
				String playAgainString = scan.nextLine().trim();
				if(playAgainString.equals("n"))
					break;
			}
			game.reset();
		}
	}
	
}
