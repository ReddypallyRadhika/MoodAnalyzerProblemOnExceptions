package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzerException {
    @Test
    public void testMoodAnalyser_HappyOrSad()
    {
        MoodAnalyzerException moodAnalyser= new MoodAnalyzerException();
        String mood = moodAnalyser.analyseMood("This is a Happy or Sad message");
        System.out.println(mood);
    }

}
