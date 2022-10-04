package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzerException {

    @Test
    public void testMoodAnalyser_HappyOrSad()
    {
       // MoodAnalyzerException moodAnalyser= new MoodAnalyzerException();
        String mood = MoodAnalyzerException.analyseMood("This is a Happy or Sad message");
        System.out.println(mood);
    }
/*Given “I am in Sad Mood” message Should Return SAD
     analyseMood method can just return SAD to pass this Test Case (TC)*/
@Test
public void testMoodAnalyser_Sad()
{
   // MoodAnalyzerException moodAnalyser= new MoodAnalyzerException();
    String mood = MoodAnalyzerException.analyseMood("This is a sad message");
    Assert.assertEquals(mood,"sad");
    System.out.println(mood);
}
}
