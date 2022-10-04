package com.bridgeLabz;
//UC1
// Given a Message, ability
//to analyse and respond
//Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
//parameter and return Happy or Sad Mood`
public class MoodAnalyzerException {
    public static String analyseMood(String msg) {

        if(msg.contains("sad")) {
            return "sad";
        }
        else
        {
            return "Happy";
        }
    }

}
