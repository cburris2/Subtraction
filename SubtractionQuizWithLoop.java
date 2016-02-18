/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subtractionquizwithloop.Subtraction;

/**
 *
 * @author office
 */
import javax.swing.JOptionPane;

public class SubtractionQuizWithLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create intitial variables 
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int wrongCount = 0;
        int count = 0;
        //String question = JOptionPane.showInputDialog("What is ");
        
        //Start of while loop
        while ( count < NUMBER_OF_QUESTIONS){
            //Generate 2 random integers between 0-9
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            
            // If number1 > number2 swap the numbers
            if(number1 < number2){
                int temp = number1;
                number1 = number2; 
                number2 = temp; 
            }
            
            //Create question window and store the answer
            String question = JOptionPane.showInputDialog("What is " + 
                    number1 + " - " + number2 + "?");
            int answer = Integer.parseInt(question);
            
            // Check the answer and display the result
            
            if(number1 - number2 == answer){
                JOptionPane.showMessageDialog(null, "Correct! Keep up the good work. ;)");
                correctCount++;
            }
            else {
                JOptionPane.showMessageDialog(null, "Wrong answer. :(");
            }
            count++;
            
            
        } // end of while loop
            
            
            JOptionPane.showMessageDialog(null,"You answered " + correctCount + 
                    " questions right out of 5 questions.");
            
    }
    
}
