package com.bridgelabz;

public class MoodAnalyzer {

	public String analyseMood(String message) {
		if(message.contains("sad"))
			return "SAD";
		return "HAPPY";
	}
}
