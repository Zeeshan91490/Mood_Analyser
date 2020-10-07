package com.capgem.moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class uc1MoodAnalysisTest {
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
    	MoodAnalyser moodObj = new MoodAnalyser("I am in Sad Mood");
    	String mood = moodObj.analyseMood();
    	Assert.assertEquals("SAD", mood);
    }
    
    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy() throws MoodAnalyserException {
    	MoodAnalyser moodObj = new MoodAnalyser("I am in Any Mood");
    	String mood = moodObj.analyseMood();
    	Assert.assertEquals("HAPPY", mood); 
    }

}
