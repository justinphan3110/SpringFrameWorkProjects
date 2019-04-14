package spring.numberguessgame.core;

public interface Game {
	int getNumber();
	int getGuess();
	void setGuess(int guess);
	int getSmallest();
	int getBiggest();
	int getRemainingGuesses();
	int getCount();
	void reset();
	void check();
	boolean isValidNumberRange();
	boolean isGameWon();
	boolean isGameLost();
}
