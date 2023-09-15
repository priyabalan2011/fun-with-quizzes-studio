package org.example;

public class MultipleChoiceQuestion extends Question{

    public MultipleChoiceQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        //check the user entered answer. eg "A" or "a".
        String actualAnswer=this.getTheAnswer();

        //check case insensitive

        if(actualAnswer.toUpperCase().equals(answer.toUpperCase()))
        {
            return true;
        }
        else {
            return false;
        }

    }
}
