package org.example;

public abstract class Question {
    //class variables
    private final String theQuestion;
    private final String theAnswer;
    //constructors


    public Question(String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }
    //methods

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    public abstract boolean checkAnswer(String answer);

}
