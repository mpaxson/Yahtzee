/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Random;

/**
 *
 * @author Mark Paxson
 */
public class Die {
    
    
    private int faceValue;

    /**
     * @return the faceValue
     */
    public  int getFaceValue() {
        return faceValue;
    }

    /**
     * @param aFaceValue the faceValue to set
     */
    public  void setFaceValue(int aFaceValue) {
        faceValue = aFaceValue;
    }
    
    
    
    
    
    
   /**
    * roll die function
    * this will set the value of faceValue to a random number from 1 to 7 
    */
   
    public  void rollDie()
    {
       
        Random random = new Random();
        faceValue = 1 + random.nextInt( 6 ) ;
    
 
    }
    
   //returns string value of faceValue
   @Override 
   public String toString()
    {
        return Integer.toString(faceValue);
        
    }
        

    
}
