/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thelogiccore.logic.ama;


/**
 *
 * @author PatrickJ
 */
public class Question {
	
	private String question;
	private String tag;
	private boolean called;
	
	public Question(String q, String t)
	{
		question = q;
		tag = t;
		called = false;
	}

	public String getQuestion()
	{
		return question;	
	}
	public String getTag()
	{
		return tag;
	}	
        
	public boolean getCalled()
        {
            return called;
        }
	public void setCalled(boolean x)
        {
            called = x;
        }
}