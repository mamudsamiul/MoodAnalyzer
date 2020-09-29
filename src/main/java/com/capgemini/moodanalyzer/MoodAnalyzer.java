package com.capgemini.moodanalyzer;

public class MoodAnalyzer {
	public boolean someLibraryMethod() {
		return true;
	}

	public String analyseMood(String message) {
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}