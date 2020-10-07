package com.capgem.moodanalyser;

public class uc2moodanalyser {
	private String message;

	public  uc2moodanalyser() {

	}

	public  uc2moodanalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if(message.contains("I am in Sad Mood"))
				return "SAD";
			else
				return "HAPPY"; 
		}catch(NullPointerException e) {
			return "HAPPY";
		}
	}
	public static void main( String[] args ) {

	}

}
