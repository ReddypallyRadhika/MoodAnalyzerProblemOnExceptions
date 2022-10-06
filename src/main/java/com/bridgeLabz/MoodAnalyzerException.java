package com.bridgeLabz;

//UC1
// Refactor the code to take the mood message in Constructor
public class MoodAnalyzerException extends Exception {
    private static String message;
    public MoodAnalyzerException(String message) {
       super(message);
      MoodAnalyzerException.message =message;

    }

    public static String analyseMood() throws MoodAnalyzerException {
try {
    if (message.contains("sad")) {
        return "sad";
    } else {
        return "Happy";
    }
}catch(NullPointerException ex){

 throw new MoodAnalyzerException("Enter proper message");

}


    }

}
