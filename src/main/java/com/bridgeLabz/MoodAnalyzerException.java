package com.bridgeLabz;

//UC1
// Refactor the code to take the mood message in Constructor
public class MoodAnalyzerException {
    private static String message="sad";
    public MoodAnalyzerException(String message) {
       super();
       MoodAnalyzerException.message =message;

    }

    public static String analyseMood() {

        if(message.contains("sad")) {
            return "sad";
        }
        else
        {
            return "Happy";
        }
    }

}
