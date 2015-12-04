/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Mark Paxson
 */
public class Roll {
    
    private ArrayList<Die> dice = new ArrayList<Die>(); 
    
    
    /*
     *Override no argumenent constructor
    */
    public Roll()   {
        initializeDice();
    }
            
    
    
    public void initializeDice()
    {
        /*
            numDice is the number of times to be looped
          
        */int numDice = 5; 
            
           
        
        for ( int i = 0; i < numDice; i++ )
        {
            Die die= new Die();
            die.rollDie();
            dice.add(die);
            
        }//end for loop
        
    }//end initializeDice()
    
    
    /*
       *loop through member variable of dice 
       * display to the console the result of toString() in class Die
    */
    public void rollDice()
    {
        
        for (int i = 0; i < dice.size() ; i++)
        {
            
            //prints the value of die to the console
            //stores the string 
            String iString = "Die " + Integer.toString(i+1) + " rolled a value of " 
                            + dice.get(i).toString() ;
            
           System.out.println(iString) ;
            
        }//end for loop
        
        
        
        
    }//end rollDice() method
    
    
    
}// end ROll class
