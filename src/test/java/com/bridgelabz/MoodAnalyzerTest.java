package com.bridgelabz;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenSadMessageReturnSad() {
		MoodAnalyzer MoodAnalyserTest = new MoodAnalyzer();
		String mood = MoodAnalyserTest.analyseMood("Hello i am Sad");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenHappyMessageReturnHappy() {
		MoodAnalyzer MoodAnalyserTest = new MoodAnalyzer();
		String mood = MoodAnalyserTest.analyseMood("Hello i am Happy");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNullMassageShouldReturnHappyMessage() {
		MoodAnalyzer MoodAnalyserTest = new MoodAnalyzer(null);
		String mood = MoodAnalyserTest.exceptionAnalyseMood();
		Assert.assertEquals("HAPPY", mood);

	}
}
