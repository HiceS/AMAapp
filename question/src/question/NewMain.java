/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package question;

/**
 *
 * @author Jamieg
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        QuestionBank questions = new QuestionBank();
        
        questions.add("What do you like?", "casual");
        
        questions.add("Who do you like?", "casual");
        
        System.out.println(questions.tags("Computer Science").get(0).getQuestion());
        
    }
    
}
