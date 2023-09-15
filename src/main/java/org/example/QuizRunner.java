package org.example;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz quiz=new Quiz();

        MultipleChoiceQuestion multipleChoiceQuestion=new MultipleChoiceQuestion(" How many legs does a spider have?\n A.3  \n B.5 \n C.8 \n D.6","C");
        quiz.addQuestion(multipleChoiceQuestion);

        CheckboxQuestion checkboxQuestion=new CheckboxQuestion("Which animal can fly?\n A.Penquin \n B.Dove \n C.Bird","B,C");
        quiz.addQuestion(checkboxQuestion);

        TrueOrFalseQuestion trueOrFalseQuestion=new TrueOrFalseQuestion("School bus color is yellow \n A. True \n B. False","A");
        quiz.addQuestion(trueOrFalseQuestion);

        quiz.runQuiz();


    }
}
