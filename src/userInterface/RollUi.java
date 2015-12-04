/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Mark Paxson
 */
public class RollUi extends JPanel {
    
    
    private JButton roll = new JButton();
    private RollAction rollAction = new RollAction();
    
    private DiceAction diceAction = new DiceAction();
    private ArrayList<JToggleButton> dice = new ArrayList<JToggleButton>();
    
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();
    
    //DIMENSIONS
   
    private Dimension rollDim = new Dimension ( 75 , 50 );
    
    
    public RollUi()
    {
        initDice();
        initComponents();
    }
    
    
    private void initDice()
    {
        for (int i = 0; i < core.Constants.NUM_DICE; i++)
        {
            JToggleButton tempButton = new JToggleButton();
            tempButton.addActionListener(diceAction);
            tempButton.setText("#"+ Integer.toString(i +1) );
            tempButton.setPreferredSize(core.Constants.DICE_DIM);
            dice.add(i, tempButton);
        }
    }
    
    
    private void initComponents()
    {
        this.setLayout(gridBagLayout);
        this.setBorder(core.Constants.BLACK_LINE);
        c.weightx =1.0;
        c.anchor = GridBagConstraints.CENTER;
        c.fill= GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,5,5,5);
        
         /*
            *set roll button and define what happens when the button is pressed
            *look at RollAction class to see what happens 
        */
        roll.addActionListener(rollAction); 
        roll.setPreferredSize(rollDim);
        roll.setText("ROLL");
        
        this.addComponent(0, 0, 1, 1, this, roll);
                
        
        /*  Just simply adds all the dice to the collection
             goes through dice colluction and adds them
        */
        for ( int i = 0; i < core.Constants.NUM_DICE; i++)
        {
           // dice.get(i).setPreferredSize(core.Constants.DICE_DIM);
            this.addComponent( 1 + i, 0 , 1, 1, this,  dice.get(i)  );
        }
    }
    
    
    
    private void addComponent(int x, int y, int w, int h,
            Container aContainer, Component aComponent)
    {
        c.gridx = x;  
        c.gridy = y;  
        c.gridwidth = w;  
        c.gridheight = h;  
        gridBagLayout.setConstraints( aComponent, c );  
        aContainer.add( aComponent );  
    }  
    
   private class RollAction implements ActionListener
   {
       
       @Override
       public void actionPerformed(ActionEvent e)
       {
           /*Write code here what Happen*/
           
    
           /*
                When the roll button is clicked displays the name of the button
           */
           JOptionPane.showMessageDialog(null, e.getActionCommand() );
       
           
           
       }
   }
   
   private class DiceAction implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           
                   
           /*
                    *this will store the states of the buttons 
                        and retrieve information when clicked
           
                    *Since we dont know what will be the source 
                        while programming we must type cast it 
           */
           JToggleButton tempButton = (JToggleButton) e.getSource();
           
           String tempSelectedString = "Dice " + e.getActionCommand() + " is selected!";
           
           String tempNotSelectedString = "Dice " + e.getActionCommand() + " isn't selected!";
           
           /*
                    *This will go through a conditional loop whether or not the button is now selected or not
           */
           
           if(tempButton.isSelected())
                JOptionPane.showMessageDialog(null, tempSelectedString);
          
           else
                JOptionPane.showMessageDialog(null, tempNotSelectedString);
           
           
       
           
       }
   }
}