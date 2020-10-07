package com.capgem.moodanalyser;

enum ExceptionCause {
	EMPTY, NULL;
}

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyserException {
		try {
			if(message.contains("I am in Sad Mood"))
				return "SAD";
			else if(message.isBlank()) {
				ExceptionCause causeOne = ExceptionCause.EMPTY;
				throw new MoodAnalyserException("You can't have the message as " + causeOne);
			}
			else
				return "HAPPY"; 
		}
		catch(NullPointerException e) {
			ExceptionCause causeTwo = ExceptionCause.NULL;
			throw new MoodAnalyserException("You can't have the message as " + causeTwo);
		}
	}
	public static void main( String[] args ) {
	}}
