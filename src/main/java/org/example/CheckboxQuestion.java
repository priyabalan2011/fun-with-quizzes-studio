package org.example;

public class CheckboxQuestion extends Question{
    public CheckboxQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        //check the answer - "A,C,D" or "a,c,d"

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
