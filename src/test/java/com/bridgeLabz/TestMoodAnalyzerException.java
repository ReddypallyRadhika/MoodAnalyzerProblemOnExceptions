package com.bridgeLabz;


//import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMoodAnalyzerException {

    @Test
    public void testMoodAnalyser_NullPointerException() throws MoodAnalyzerException {
        MoodAnalyzerException moodAnalyzerException = new MoodAnalyzerException();
        try {
            moodAnalyzerException.analyseMood("null");
        }catch (MoodAnalyzerException e) {
            assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_INVALID, e.type);System.out.println(e.getMessage());
        }
        }
    @Test
    public void testMoodAnalyser_NullPointerException_Null() throws MoodAnalyzerException {
        MoodAnalyzerException moodAnalyzerException = new MoodAnalyzerException();
        try {
            moodAnalyzerException.analyseMood("null");
        }catch (MoodAnalyzerException e) {
            assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
            System.out.println(e.getMessage());
        }
    }
    }
