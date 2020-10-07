package com.capgem.moodanalyser;

public class uc1moodanalyser {
private String message;
	
	public uc1moodanalyser() {
		
	}

	public uc1moodanalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		if(message.contains("I am in Sad Mood"))
			return "SAD";
		else
			return "HAPPY"; 
	}
	public static void main( String[] args ) {
		
	}
}
