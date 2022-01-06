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
	public void givenNullMassageShouldReturnHappyMessage() throws MoodAnalysisException {
		MoodAnalyzer MoodAnalyserTest = new MoodAnalyzer(null);
	    String mood = MoodAnalyserTest.exceptionAnalyseMood();
	    Assert.assertEquals("HAPPY",mood);

	}
	

    @Test
    public void givenEmptyMessageShouldReturnThrowCustomException() 
    {
    	MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
        try 
        {
        	moodAnalyzer.analyseMood(" ");
        } 
        catch (MoodAnalysisException e) 
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.getMessage());
            System.out.println(e.type);
            System.out.print(e.getMessage());

        }
    }
}
