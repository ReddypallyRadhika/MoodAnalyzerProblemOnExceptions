package com.bridgeLabz;


//import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMoodAnalyzerException {

    @Test
    public void testMoodAnalyser_NullPointerException() throws MoodAnalyzerException {
        MoodAnalyzerException moodAnalyzerException = new MoodAnalyzerException();
        try {
            moodAnalyzerException.analyseMood("sad");
        }catch (MoodAnalyzerException e) {
            assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_INVALID, e.type);
//throw new MoodAnalyzerException();
System.out.println(e.getMessage());
        }
        }
    }
