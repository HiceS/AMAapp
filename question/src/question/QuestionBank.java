/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package question;

import java.util.ArrayList;
/**
 *
 * @author PatrickJ
 */
public class QuestionBank {
    
    private ArrayList<Question> questions;
    
    public QuestionBank()
    {
        questions = new ArrayList<Question>();
    }
    
    public void add(String question, String tag)
    {
        questions.add(new Question(question, tag));
    }
    
    public ArrayList<Question> getQuestions(String tag)
    {
        ArrayList<Question> askable = new ArrayList<Question>();
        
        for(Question question: questions)
        {
            if(question.getTag().equals(tag))
            {
                askable.add(question);
            }
        }
        
        return askable;
    }
    
    public void markAsked(Question quest)
    {
        for(Question question: questions)
        {
            if(question.getQuestion().equals(quest.getQuestion()))
            {
                question.setCalled(true);
            }
        }
    }
}
