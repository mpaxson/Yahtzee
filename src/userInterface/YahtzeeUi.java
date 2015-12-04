/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import core.Game;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import yahtzee.Yahtzee;

/**
 *
 * @author Mark Paxson
 */
public class YahtzeeUi {
   
    private GameUi gameUi; 
    private PlayerUi playerUi;
    private RollUi rollUi;
    private ScoreCardUi scoreCardUi;

    
    private JFrame frame;
    private JPanel rightPanel;
 
    private JMenuBar menuBar;
    private JMenu game;
    private JMenuItem exit;
    private JMenuItem newGame;
    
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();
      
    private Dimension frameDim = new Dimension( 400, 800);
    private Dimension menuBarDim = new Dimension( 50, 20);
    
    
    public YahtzeeUi()
    {
        initComponents();
    }

    
     private void addPlayerUi(JFrame frame, PlayerUi playerUi)
   {
       c = new GridBagConstraints();
       c.fill= GridBagConstraints.HORIZONTAL;
       c.weightx = 1.0;
       c.gridx = 0;
       c.gridy =0;
       c.gridheight=1;
       c.gridwidth = 1;    
       frame.add(playerUi, c);
   }
   
     
   private void addGameUi(JFrame frame, GameUi gameUi)
   {
       c = new GridBagConstraints();
       c.fill= GridBagConstraints.HORIZONTAL;
       c.weightx = 1.0;
       c.gridx = 1;
       c.gridy = 0;
       c.gridheight = 1;
       c.gridwidth = 1;
       frame.add(gameUi, c);
   }
   
   
   private void addRollUi(JFrame frame, RollUi rollUi)
   {
        c = new GridBagConstraints();
        c.fill= GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.gridheight = 1;
        frame.add(rollUi, c);
   }
   
   
   private void addScoreCardUi(JFrame frame, ScoreCardUi scorecardUi)
   {
       c = new GridBagConstraints();
       c.fill= GridBagConstraints.HORIZONTAL;
       c.weightx = 1.0;
       c.weighty = 1;
       c.gridx = 0;
       c.gridy =2;
       c.gridwidth=2;
       c.gridheight =1;
       frame.add(scoreCardUi, c);
   }
      
  
    
    private void initComponents()
    {
        gameUi = new GameUi();
        playerUi = new PlayerUi();
        rollUi = new RollUi();
        //rollUi.setPreferredSize(core.Constants.ROLLUI_DIM);
        scoreCardUi = new ScoreCardUi();
        //  scoreCardUi.setMinimumSize(core.Constants.SCORECARDUI_DIM);
        rightPanel = new JPanel();
        menuBar = new JMenuBar();
        game = new JMenu("Game");
        exit = new JMenuItem("Exit");
        newGame = new JMenuItem("New Game");
        frame = new JFrame("YAHTZEE developed by Mark Paxson");
       
        //makes sure the frame closes when menu exit is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(gridBagLayout);
        frame.setSize(frameDim);
        frame.setPreferredSize(frameDim);
  
        //Jmenu
        exit.addActionListener(new GameMenuAction());
        newGame.addActionListener(new GameMenuAction());
        menuBar.add(game);
        game.add(newGame);
        game.add(exit);
        frame.setJMenuBar(menuBar);
        
        //to edit constraints go to individual functions
        //use functions to organize setting the constraints
        addPlayerUi(frame, playerUi);
        addGameUi(frame, gameUi);
        addRollUi(frame, rollUi);
        addScoreCardUi(frame, scoreCardUi);
 
        frame.setVisible(true);
        frame.validate();
        frame.repaint();
        frame.pack();
        
    }//end initComponents
    
    
    private class GameMenuAction implements ActionListener
    {
     
        public void actionPerformed(ActionEvent e)
       {
       
           //remove previous content
           rightPanel.removeAll();
           
           if (e.getActionCommand() == "Exit")
           {
               int response = JOptionPane.showConfirmDialog(null,
                       "Are you sure you want to exit?", "Exit?", JOptionPane.YES_NO_OPTION);
               
                //if they click yes
               if (response == JOptionPane.YES_OPTION)
                   System.exit(0);
               
           }//end exit action
           
           if (e.getActionCommand() == "New Game")
           {
            //  Yahtzee.main(Game);
             
                 int response = JOptionPane.showConfirmDialog(null,
                       "Are you sure you want to start a new game?", "Exit?", JOptionPane.YES_NO_OPTION);
           }//end new Game               Yahtzee.game = new Game();

           
       }//end actionPerformed
       
   }//end GameMenuAction
 

     //for basics adding when no weight is needed 
     private void addComponent(int x, int y, int w, int h,
            Container aContainer, Component aComponent)
    {
        c = new GridBagConstraints();
        c.gridx = x;  
        c.gridy = y;  
        c.gridwidth = w;  
        c.gridheight = h;  
        gridBagLayout.setConstraints( aComponent, c );  
        aContainer.add( aComponent );  
    }  
     
     
     
}





