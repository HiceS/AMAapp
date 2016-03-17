/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thelogiccore.logic.ama;



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PatrickJ
 */
public class QuestionBank {
    
    private static ArrayList<Question> questions;
    
    
    public QuestionBank()
    {
        questions = new ArrayList<>();

        QuestionBank.add("What's your favorite position?", "XXX");
        QuestionBank.add("What color underwear are you wearing?", "XXX");
        QuestionBank.add("What's the naughtiest thing you've ever done?", "XXX");
        QuestionBank.add("Have you ever said another persons name during sex?", "XXX");
        QuestionBank.add("Boobs or booty?", "XXX");
        QuestionBank.add("Have you ever had sex in public?", "XXX");
        QuestionBank.add("Do you shave down stairs?", "XXX");
        QuestionBank.add("Do you prefer interpreted or compiled?", "Computer Science");
        QuestionBank.add("Which is better: Intel or AMD?", "Computer Science");
        QuestionBank.add("Do you like laptops or desktops better?", "Computer Science");
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
        QuestionBank.add("What's your favorite position?", "XXX");
        QuestionBank.add("What color underwear are you wearing?", "XXX");
        QuestionBank.add("What's the naughtiest thing you've ever done?", "XXX");
        QuestionBank.add("Have you ever said another persons name during sex?", "XXX");
        QuestionBank.add("Boobs or booty?", "XXX");
        QuestionBank.add("Have you ever had sex in public?", "XXX");
        QuestionBank.add("Do you shave down stairs?", "XXX");
        QuestionBank.add("Do you prefer interpreted or compiled?", "Computer Science");
        QuestionBank.add("Which is better: Intel or AMD?", "Computer Science");
        QuestionBank.add("Do you like laptops or desktops better?", "Computer Science");
        QuestionBank.add("What is your favorite ice cream?", "Generic");
        QuestionBank.add("What is your favorite type of tree?", "Generic");
        QuestionBank.add("New line or same line brackets?", "Computer Science");
        QuestionBank.add("Are you a fan of Microsoft products?", "Computer Science");
        QuestionBank.add("How would feel if I died tomorrow?", "Awkward");
        QuestionBank.add("Do you like eating hair in the middle of the night?", "Awkward");
        QuestionBank.add("Do you enjoy smelling me as much I enjoy smelling you?", "Awkward");
        QuestionBank.add("Why are you single?", "Awkward");
        QuestionBank.add("Do you like the great outdoors?", "Generic");
        QuestionBank.add("How many extra chromosomes do you have?", "Awkward");
        QuestionBank.add("How is your home life?", "Generic");
        QuestionBank.add("Is today tomorrow in New Zealand?", "Generic");
        QuestionBank.add("What kind of porn do you like?", "XXX");
        QuestionBank.add("What is the meaning of life?", "Generic");
        QuestionBank.add("Do you go on /b?", "XXX");
        QuestionBank.add("Why is Fauzi's spine so muscular?", "Awkward");
        QuestionBank.add("Why are you so dumb?", "Awkward");
        QuestionBank.add("What is your fetish?", "XXX");
        QuestionBank.add("Do you like python?", "Computer Science");
        QuestionBank.add("What's a good computer science question?", "Computer Science");
        QuestionBank.add("What does Jamie have that I don't?", "Awkward");
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
        
        for(Question question : QL) {
            if (!question.getCalled() && question.getQuestion().toLowerCase().contains(search.toLowerCase()))
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

        if(quest.size() == 1)
            for(int i = 0; i < questions.size(); i++)
                questions.get(i).setCalled(false);

        quest.get(index).setCalled(true);

        return quest.get(index);
    }

    public Question getRandomQuestion()
    {
        ArrayList<Question> quest = new ArrayList<>();


        for(Question q:questions)
        {
            if(!q.getCalled())
                quest.add(q);
        }
        int index = (int)(Math.random()*(quest.size()));
        if(quest.size() == 1)
            for(int i = 0; i < questions.size(); i++)
                questions.get(i).setCalled(false);

        quest.get(index).setCalled(true);

        return quest.get(index);
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
    
    public static ArrayList<Question> getQuestions()
    {
        return questions;
    }
}
