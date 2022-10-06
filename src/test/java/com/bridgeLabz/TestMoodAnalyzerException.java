package com.bridgeLabz;


import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzerException {

    @Test
    public void testMoodAnalyser_sad()
    {
        String mood = MoodAnalyzerException.analyseMood();
        Assert.assertEquals(mood,"sad");
        System.out.println(mood);
    }
}