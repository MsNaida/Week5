package com.naidachang.week5;

	
	import java.util.Date;

public class SpacedLogger extends AsteriskLogger {
		
	//The SpacedLogger should add spaces between each character of the String argument passed into its methods. 
	//If the log method received “Hello” as an argument, it should print H e l l o 

	//The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
		
		public void log(String log) {
			Date date = new Date();
			System.out.println(date.toString() + " : Log - " + log.replaceAll(".(?!$)", "$0 ")); 
			
		}

		@Override
		public void error(String error) {				
			Date date = new Date();
			System.err.println(date.toString() + " : ERROR - " + error.replaceAll(".(?!$)", "$0 "));
					
		}

}
