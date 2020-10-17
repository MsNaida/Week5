package com.naidachang.week5;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
	
		logger.log("This is FUN!!!");
		logger.error("Please try again.");		
		
		logger2.log("This is FUN!!!");
		logger2.error("Please try again.");
		
	}
	

}
