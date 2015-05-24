/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thelogiccore.logic.ama.ama;



import com.thelogiccore.logic.ama.*;
import com.thelogiccore.logic.ama.Question;

import java.util.ArrayList;

/**
 *
 * @author PatrickJ
 */
public class QuestionBank {
    
    private static ArrayList<com.thelogiccore.logic.ama.ama.Question> questions;


    public QuestionBank()
    {
        questions = new ArrayList<>();

        QuestionBank.add("How much does Fauzi weigh?", "Awkward");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you love Fauzi?", "Awkward");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you love me?", "Awkward");
        com.thelogiccore.logic.ama.QuestionBank.add("How do you feel about linux?", "Computer Science");
        com.thelogiccore.logic.ama.QuestionBank.add("What is your favorite programing language?", "Computer Science");
        com.thelogiccore.logic.ama.QuestionBank.add("What should we name our first child?", "Awkward");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you even lift?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("What do you do for fun?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("How much can you bench?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("What is your favorite feature?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("Why are ou so attracted to me?", "Awkward");
        com.thelogiccore.logic.ama.QuestionBank.add("What are you doing right now?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you like to cook?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you have any pets?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you have any siblings?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("How many types of cheese are there in the world?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("How fast can you grow a beard?", "Awkward");
        com.thelogiccore.logic.ama.QuestionBank.add("Harry Potter or Twilight?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you know the muffin man?", "Awkward");
        com.thelogiccore.logic.ama.QuestionBank.add("What do you think happens after you die?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("What is your favorite food?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("What is the meaning of life?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("Who would you want to be trapped on a dessert island with?", "Generic");
        com.thelogiccore.logic.ama.QuestionBank.add("What's your favorite position?", "XXX");
        com.thelogiccore.logic.ama.QuestionBank.add("What color underwear are you wearing?", "XXX");
        com.thelogiccore.logic.ama.QuestionBank.add("What's the naughtiest thing you've ever done?", "XXX");
        com.thelogiccore.logic.ama.QuestionBank.add("Have you ever said another persons name during sex?", "XXX");
        com.thelogiccore.logic.ama.QuestionBank.add("Boobs or booty?", "XXX");
        com.thelogiccore.logic.ama.QuestionBank.add("Have you ever had sex in public?", "XXX");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you shave down stairs?", "XXX");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you prefer interpreted or compiled?", "Computer Science");
        com.thelogiccore.logic.ama.QuestionBank.add("Which is better: Intel or AMD?", "Computer Science");
        com.thelogiccore.logic.ama.QuestionBank.add("Do you like laptops or desktops better?", "Computer Science");
    }

    public static void add(String question, String tag)
    {
        questions.add(new com.thelogiccore.logic.ama.Question(question, tag));
    }

    public static ArrayList<com.thelogiccore.logic.ama.Question> tags(String tag)
    {
        ArrayList<com.thelogiccore.logic.ama.Question> askable = new ArrayList<>();

        for(com.thelogiccore.logic.ama.Question question : questions)
        {
            if(!question.getCalled() && question.getTag().equals(tag))
            {
                askable.add(question);
            }
        }

        return askable;
    }

    public static ArrayList<com.thelogiccore.logic.ama.Question> search(ArrayList<com.thelogiccore.logic.ama.Question> QL, String search)
    {
        ArrayList<com.thelogiccore.logic.ama.Question> askable = new ArrayList<>();

        for(com.thelogiccore.logic.ama.Question question : QL)
        {
            if(!question.getCalled() && question.getQuestion().toLowerCase().contains(search.toLowerCase()))
            {
                askable.add(question);
            }
        }
        return askable;
    }

    public com.thelogiccore.logic.ama.Question getRandomQuestion(String tag)
    {
        ArrayList<com.thelogiccore.logic.ama.Question> quest = tags(tag);
        int index = (int)(Math.random()*(quest.size()));

        if(quest.size() == 1)
            for(int i = 0; i < questions.size(); i++)
                questions.get(i).setCalled(false);

        quest.get(index).setCalled(true);

        return quest.get(index);
    }

    public com.thelogiccore.logic.ama.Question getRandomQuestion()
    {
        ArrayList<com.thelogiccore.logic.ama.Question> quest = new ArrayList<>();


        for(com.thelogiccore.logic.ama.Question q:questions)
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

    public void markAsked(com.thelogiccore.logic.ama.Question quest)
    {
        for(com.thelogiccore.logic.ama.Question question: questions)
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
