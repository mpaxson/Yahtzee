/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mark Paxson
 */
public class Game
{
    private int gameTurn;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Scanner input = new Scanner(System.in);
    Game game = this;
    
    
    


    
    
    
    
    /**
     * @return the gameTurn
     */
    public int getGameTurn() {
        return gameTurn;
    }

    /**
     * @param gameTurn the gameTurn to set
     */
    public void setGameTurn(int gameTurn) {
        this.gameTurn = gameTurn;
    }

    /**
     * @return the players
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * @return the input
     */
    public Scanner getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
    
    
    
    
    
    public Game(){
        int numPlayers; //stores the number of players
        String consoleInput; //this will store the input from the user
        
        System.out.println("How many people are playing: ");
        consoleInput = input.nextLine() ;
        
        numPlayers = Integer.parseInt(consoleInput);
       
       
        
       
       
        numPlayers = Integer.parseInt(consoleInput);
        
 //    System.out.println( "Number of players parsed is: " + numPlayers.toString() );
        
        
        //loop through number of players
        
        for (int i = 0; i< numPlayers; i++){
            newPlayer(); 
        
        }
            
            
        
    }//ends Game() constructor
    
    public void newGame()
    {
        game = new Game();
    }
    
    
    public void newPlayer()
    {
        //output
        System.out.println("What is this player's name: ");
        
        //input from user
       String name;
       name = input.nextLine();
       
       Player player = new Player();
       
       player.setName(name); 
       
       
       //add the player to the arrayList of players
       players.add(player); 
   
    }//ends newPlayer()
    

    
    public void displayPlayers()
    {
        
        
        System.out.println("Players for this game are: ");
        for(Player player: players )
        { 
            System.out.println ( player.getName() );
        }
        
    }//ends displayPlayers()
    
    public void playGame()
    {
        for (Player player: players)
        {
            player.rollDice();
        }
    }
    
}
