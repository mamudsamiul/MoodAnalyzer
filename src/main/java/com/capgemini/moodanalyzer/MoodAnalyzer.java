package com.capgemini.moodanalyzer;

public class MoodAnalyzer {
	public boolean someLibraryMethod() {
		return true;
	}

	public String analyseMood(String message) {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			System.out.println("Exception thrown");
			return "HAPPY";
		}
	}
}