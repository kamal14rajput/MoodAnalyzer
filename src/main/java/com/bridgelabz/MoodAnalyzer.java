package com.bridgelabz;

public class MoodAnalyzer {

	public String message;

	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public MoodAnalyzer() {
		this.message = message;
	}

	public String exceptionAnalyseMood() {
		try {
			if (message.contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}

