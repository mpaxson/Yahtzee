/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import core.Game;
import userInterface.YahtzeeUi;

/**
 *
 * @author Mark
 */
public class Yahtzee {

    /**
     * @param args the command line arguments
     */
    
    //to be accessed by yahtzeeUi new game menu button
    public static Game game;
    
    public static void main(String[] args) {
        // TODO code application logic here    
        
        YahtzeeUi yahtzeeUi = new YahtzeeUi();
        game = new Game();
        game.displayPlayers();
        game.playGame();
 
    }
    
    
  
    
    
}
