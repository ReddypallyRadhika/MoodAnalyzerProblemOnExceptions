package com.bridgeLabz;

//UC2
// Refactor the code to take the mood message in Constructor
public class MoodAnalyzerException extends Exception {
    private  String message;

    public MoodAnalyzerException() {

    }

    enum ExceptionType{
        ENTERED_INVALID,ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;

    public MoodAnalyzerException(ExceptionType type,String message) {
       super(message);
       this.type =type;
      this.message =message;

    }


    public  String analyseMood(String sad) throws MoodAnalyzerException {
try {

        if (message.contains("sad")) {
            return "sad";
        } else {
            return "Happy";
        }

}catch(NullPointerException ex){

 throw new MoodAnalyzerException(ExceptionType.ENTERED_INVALID,"Enter proper message");

}

    }

}
