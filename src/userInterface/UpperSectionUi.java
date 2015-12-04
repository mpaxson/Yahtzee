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
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mark Paxson
 */
public class UpperSectionUi extends JPanel{
    //store the structure of the categories
    private class Structure
    {
        private JButton category; 
        private JLabel score;
        
        Structure()
        {
            //initialize
            category = new JButton();
            score = new JLabel();
            
        }

        /**
         * @return the category
         */
        public JButton getCategory() {
            return category;
        }

        /**
         * @param category the category to set
         */
        public void setCategory(JButton category) {
            this.category = category;
        }

        /**
         * @return the score
         */
        public JLabel getScore() {
            return score;
        }

        /**
         * @param score the score to set
         */
        public void setScore(JLabel score) {
            this.score = score;
        }
        
    }
    
    
    
  
 
    //store the structure
    LinkedList<Structure> linkedList = new LinkedList<Structure>();
    private int UPPER_CATEGORIES = 6;
    int i =0;
    


  
   
  
   
    //action listener for the buttons
    private CategoryAction categoryAction = new CategoryAction();
    
    private JLabel totalScore = new JLabel();
    private JLabel totalScoreNum = new JLabel();
    
    private JLabel total = new JLabel();
    private JLabel totalNum = new JLabel();
    
    
    private JLabel bonus = new JLabel();
    private JLabel bonusNum = new JLabel();
   
    
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();
    
    
    
    

    
    
    
   public UpperSectionUi()
   {
       
        initLinkedList();
        initComponents();
    
   }
    
   
        
    private void initComponents()
    {
       
        this.setLayout(gridBagLayout);
        this.setBorder(core.Constants.BLACK_LINE);
        c.weightx =1.0;
        c.anchor = GridBagConstraints.CENTER;
        c.fill= GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,5,5,5);

        
        totalNum.setPreferredSize(core.Constants.SCORE_DIM);
        totalNum.setText("0");
        
        totalScoreNum.setPreferredSize(core.Constants.SCORE_DIM);
        totalScoreNum.setText("0");
        
        bonusNum.setPreferredSize(core.Constants.SCORE_DIM);
        bonusNum.setText("If total score is 63 or over");
        
        
        //initialize the other labels
        total.setPreferredSize(core.Constants.CATEGORY_DIM);
      //  total.setLayout(gridBagLayout);
        total.setText("Total");
        
        
        bonus.setPreferredSize(core.Constants.CATEGORY_DIM);
        //bonus.setLayout(gridBagLayout);
        bonus.setText("Bonus");
        
      
        
        totalScore.setPreferredSize(core.Constants.CATEGORY_DIM );
        //totalScore.setLayout(gridBagLayout);
        totalScore.setText("Total Score");
        
        
        this.addComponent(0, 6, 1, 1, this, total);
        this.addComponent(0, 7, 1, 1, this, bonus);
        this.addComponent(0, 8, 1, 1, this, totalScore);
        
        this.addComponent(1, 6, 1, 1, this, totalNum);
        this.addComponent(1, 7, 1, 1, this, bonusNum);
        this.addComponent(1, 8, 1, 1, this, totalScoreNum);
        
        
            linkedList.get(0).getCategory().setText("Aces");
            linkedList.get(0).getScore().setText("Cound and add only aces");
            
            linkedList.get(1).getCategory().setText("Twos");
            linkedList.get(1).getScore().setText("Count and add only twos");
           
            
            linkedList.get(2).getCategory().setText("Threes");
            linkedList.get(2).getScore().setText("Threes");
            
            
            linkedList.get(3).getCategory().setText("Fours");
            linkedList.get(3).getScore().setText("Fours");
            
            
            linkedList.get(4).getCategory().setText("Fives");
            linkedList.get(4).getScore().setText("Fives");
            
                    
            linkedList.get(5).getCategory().setText("Sixes");
            linkedList.get(5).getScore().setText("Sixes");
            
            
        //configure this for ui
        
        
            //initialize the different score categories
            //access the categories added to linked list to edit them
            for (i =0; i < linkedList.size(); i++) 
            {
                //category
               this.addComponent(0, i, 1, 1, this, linkedList.get(i).getCategory());
               
               //score
               this.addComponent(1, i , 1, 1, this, linkedList.get(i).getScore());

    
            }
            
            
            

    }
   
   
   
   
   
   
     private void initLinkedList()
    {
         for (i =0 ; i < UPPER_CATEGORIES; i++)
         {
            Structure structure = new Structure();
      
            
             
                /*    create temporar buttons and labels to 
                      be used for the loop since the resolution of 
                      these will be the same
                */
                JButton tempButton = new JButton();
                tempButton.addActionListener(categoryAction);
               // tempButton.setPreferredSize(core.Constants.CATEGORY_DIM);
               
                
                JLabel tempLabel = new JLabel();
              //  tempLabel.setPreferredSize(core.Constants.SCORE_DIM);
               // tempLabel.setLayout(gridBagLayout);
                
                //add these temp label and buttons to the structure
                structure.setCategory(tempButton);
                structure.setScore(tempLabel);
                
                
                //will need to set the resultion and grid c 
                //of all of these in the structure
             
                
                //we want all the category sections to look the same this will allow us to
                //add structure to index i
                
                linkedList.add(i, structure);
                
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
 
 private class CategoryAction implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
                 JOptionPane.showMessageDialog(null , e.getActionCommand()); 
       }
   }
 
}
    
    
    
    