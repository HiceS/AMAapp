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
    
    private static ArrayList<Question> questions;
    
    public QuestionBank()
    {
        questions = new ArrayList<>();
    }
    
    public static void add(String question, String tag)
    {
        questions.add(new Question(question, tag));
    }
    
    public static ArrayList<Question> tags(String tag)
    {
        ArrayList<Question> askable = new ArrayList<>();
        
        for(Question question : questions)
        {
            if(!question.getCalled() && question.getTag().equals(tag))
            {
                askable.add(question);
            }
        }
        
        return askable;
    }
    
    public static ArrayList<Question> search(ArrayList<Question> QL, String search)
    {
        ArrayList<Question> askable = new ArrayList<>();
        
        for(Question question : QL)
        {
            if(!question.getCalled() && question.getQuestion().toLowerCase().contains(search.toLowerCase()))
            {
                askable.add(question);
            }
        }
        return askable;
    }
    
    public static void markAsked(Question quest)
    {
        for(Question question: questions)
        {
            if(question.getQuestion().equals(quest.getQuestion()))
            {
                question.setCalled(true);
            }
        }
    }
    
    public static ArrayList<Question> getQuestions()
    {
        return questions;
    }
}
