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
        
        QuestionBank.add("How much does Fauzi weigh?", "Awkward");
        QuestionBank.add("Do you love Fauzi?", "Awkward");
        QuestionBank.add("Do you love me?", "Awkward");
        QuestionBank.add("How do you feel about linux?", "Computer Science");
        QuestionBank.add("What is your favorite programing language?", "Computer Science");
        QuestionBank.add("What should we name our first child?", "Awkward");
        QuestionBank.add("Do you even lift?", "Generic");
        QuestionBank.add("What do you do for fun?", "Generic");
        QuestionBank.add("How much can you bench?", "Generic");
        QuestionBank.add("What is your favorite feature?", "Generic");
        QuestionBank.add("Why are you so attracted to me?", "Awkward");
        QuestionBank.add("What are you doing right now?", "Generic");
        QuestionBank.add("Do you like to cook?", "Generic");
        QuestionBank.add("Do you have any pets?", "Generic");
        QuestionBank.add("Do you have any siblings?", "Generic");
        QuestionBank.add("How many types of cheese are there in the world?", "Generic");
        QuestionBank.add("How fast can you grow a beard?", "Awkward");
        QuestionBank.add("Harry Potter or Twilight?", "Generic");
        QuestionBank.add("Do you know the muffin man?", "Awkward");
        QuestionBank.add("What do you think happens after you die?", "Generic");
        QuestionBank.add("What is your favorite food?", "Generic");
        QuestionBank.add("What is the meaning of life?", "Generic");
        QuestionBank.add("Who would you want to be trapped on a dessert island with?", "Generic");
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
    
    public Question getRandomQuestion(String tag)
    {
        ArrayList<Question> quest = tags(tag);
        int index = (int)(Math.random()*(quest.size()));
        markAsked(quest.get(index));
        return quest.get(index);
    }
    
    public void markAsked(Question quest)
    {
        for(int i = 0; i < questions.size(); i++)//Question question: questions)
        {
            Question question = questions.get(i);
            
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
