package com.example.codeclan.wordcountlab;


public class Phrase {

    private String sampleString;

    public Phrase(String sampleString){
        this.sampleString = sampleString;
    }

    public int wordCount(String userInput) {
        String[] output = userInput.split(" ");
        return output.length;
    }

    public String getSampleString(){
        return this.sampleString;
    }
}
