package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions=new ArrayList<Question>();
    private int numberOfCorrectAnswers=0;
    private Scanner input= new Scanner(System.in);

    //coonstructors
    public  Quiz()
    {

    }
    //Methods
    public void addQuestion(Question question)
    {
        this.questions.add(question);
    }
    public void  runQuiz()
    {
        //loop through each question
        for(Question question:questions)
        {
        //ask the user the question
            System.out.println(question.getTheQuestion());
        //get the user answer
        String usersAnswer=this.getUserAnswers();
        //check the answer
            boolean checkanswer=question.checkAnswer(usersAnswer);
            //increment if the checkanswer is true.
            if(checkanswer)
            {
                this.numberOfCorrectAnswers++;
            }

        }
        //grade the quiz

        double  userPercentage= ((double)this.numberOfCorrectAnswers/(double)this.questions.size())*100;
        System.out.println("User Grade :" +userPercentage  + "%");

    }

    private String getUserAnswers()
    {
        String usersAnswer=input.nextLine();
        return usersAnswer;
    }


}
