package com.naidachang.week5;

import java.util.Date;

public class AsteriskLogger implements Logger{
	
		

//		The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String
	
		
		public void log(String log) {
			Date date = new Date();
			System.out.println(date.toString() + " : *** Log - " + log + " *** ");
			
		}

//		The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
//		with the String preceded by the word “ERROR:”. 
		
	
		public void error(String error) {
			String errorNew = "********************************";
			System.out.println(errorNew + "\n" + ("*** ERROR - " + error + "***") + "\n" + errorNew );
						
		}
		
	
}



