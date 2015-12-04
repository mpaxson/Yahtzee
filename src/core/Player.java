/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Mark Paxson
 */
public class Player {
    
    private String name;
    private ScoreCard score;
    private Roll roll;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the score
     */
    public ScoreCard getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(ScoreCard score) {
        this.score = score;
    }

    /**
     * @return the roll
     */
    public Roll getRoll() {
        return roll;
    }

    /**
     * @param roll the roll to set
     */
    public void setRoll(Roll roll) {
        this.roll = roll;
    }
    
    
    public Player() 
    {
        //instantiate a new roll
        Roll tempRoll = new Roll();
                
        //use getter and setters to set it
        this.setRoll(tempRoll);
    }
    
   public void rollDice()
    {
       
       //output
       System.out.println("");//adds a new line seperating players
       System.out.println("Player " + name + " rolled:" );
       
       //rolls the dice
       roll.rollDice();

    }//end rollDice()
    
}//ends Player class
