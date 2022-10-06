package com.bridgeLabz;


import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzerException {

    @Test
    public void testMoodAnalyser_NullPointerException() throws MoodAnalyzerException {

        String mood = MoodAnalyzerException.analyseMood();
        Assert.assertEquals(mood,"");

    }
}