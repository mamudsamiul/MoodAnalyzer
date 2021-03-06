/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgemini.moodanalyzertest;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.capgemini.moodanalyzer.MoodAnalyzer;
import com.capgemini.moodanalyzer.MoodAnalyzerException;

import junit.framework.Assert;
import static org.junit.Assert.*;

public class MoodAnalyzerTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood("This is a sad message");
		} catch (MoodAnalyzerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood("This is a happy message");
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = null;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyzerException.class);
			mood = moodAnalyzer.analyseMood(null);
			Assert.assertEquals("Please enter valid mood", mood);
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
	}
}
