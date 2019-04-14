package spring.numberguessgame.core;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.numberguessgame.core.configuration.MaxNumber;
import spring.numberguessgame.core.configuration.MinNumber;

@Component
public class NumberGeneratorImpl implements NumberGenerator {
	// == Fields== 
	private final Random random = new Random();
	
	@Autowired
	@MaxNumber
	private final int MAX ;
	
	@Autowired
	@MinNumber
	private final int MIN;
	
	public NumberGeneratorImpl(@MaxNumber int MAX, @MinNumber int MIN) {
		this.MAX = MAX;
		this.MIN = MIN;
	}
	
	
	@Override
	public int next() {
		return random.nextInt(MAX - MIN) * MIN;
	}
	
	@Override
	public int getMin() {
		return MIN;
	}

	@Override
	public int getMax() {
		return MAX;
	}
	

}
