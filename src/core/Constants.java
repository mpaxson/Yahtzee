/*
 * Karin Whiting
 * COP 3330 Object Oriented Programming
 * University of Central Florida
 */

package core;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Constants 
{
    //ui borderlines
   public final static Border BLACK_LINE = BorderFactory.createLineBorder(Color.black) ;
    
    //constants for UserInterface
    public final static Dimension ROLLUI_DIM = new Dimension(400, 200);
    public final static Dimension SCORECARDUI_DIM = new Dimension(400, 500);
   
    public final static Dimension TOP_ROW_DIM = new Dimension(50, 25);
    public final static Dimension CATEGORY_DIM = new Dimension(100, 50);
    public final static Dimension SCORE_DIM = new Dimension(100, 50);
    public final static Dimension DICE_DIM = new Dimension (50, 50);
    
    
    
    // constant for yahtzee
    public final static int MAX_YAHTZEE = 4;
    
    // constants for the dice
    public final static int NUM_DICE = 5;
    public final static int MAX_DIE_VALUE = 6;    

    // constants for the categories
    public final static int ONES = 1;
    public final static int TWOS = 2;
    public final static int THREES = 3;
    public final static int FOURS = 4;
    public final static int FIVES = 5;
    public final static int SIXES = 6;
    public final static int THREE_KIND = 7;
    public final static int FOUR_KIND = 8;
    public final static int CHANCE = 9;
    public final static int NUM_CATERGORY = 13;
    
    // static scores
    public final static int FULL_HOUSE = 25;
    public final static int SM_STRAIGHT = 30;
    public final static int UPPER_BONUS = 35;
    public final static int LG_STRAIGHT = 40;
    public final static int YAHTZEE = 50;   
    public final static int YAHTZEE_BONUS = 100;
}