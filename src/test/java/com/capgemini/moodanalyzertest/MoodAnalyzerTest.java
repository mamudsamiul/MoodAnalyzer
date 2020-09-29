/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgemini.moodanalyzertest;

import org.junit.Test;
import com.capgemini.moodanalyzer.MoodAnalyzer;
import junit.framework.Assert;
import static org.junit.Assert.*;

public class MoodAnalyzerTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood("This is a sad message");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY", mood);
	}
}
