/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mark Paxson
 */
public class LowerSectionUi extends JPanel{
    
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
    
    
    
  
 
    //store the structure which will hold all the category elements
    LinkedList<Structure> linkedList = new LinkedList<Structure>();
    private int UPPER_CATEGORIES = 7;
    
    //action listener for category buttons\
    CategoryAction categoryAction = new CategoryAction();
    
    int i =0;
   
    
    private JLabel round = new JLabel();
    private JLabel roundNum = new JLabel();
    
    private JLabel totalLower = new JLabel();
    private JLabel totalLowerNum = new JLabel();
    
    
    private JLabel totalUpper = new JLabel();
    private JLabel totalUpperNum = new JLabel();
    
    
    
    private JLabel grandTotal = new JLabel(); 
    private JLabel grandTotalNum = new JLabel();
    
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();
  
    
    //override no argument in structor
    public LowerSectionUi()
    {
        initLinkedList();
        initComponents();
    }
    
    
    private void initComponents()
    {
        this.setLayout(gridBagLayout);
        //JLABELS
        this.setBorder(core.Constants.BLACK_LINE);
        c.weightx =1.0;
        c.anchor = GridBagConstraints.CENTER;
        c.fill= GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,5,5,5);
 
        roundNum.setPreferredSize(core.Constants.SCORE_DIM);
        roundNum.setText("0");
        
        totalLowerNum.setPreferredSize(core.Constants.SCORE_DIM);
        totalLowerNum.setText("0");
        
        totalUpperNum.setPreferredSize(core.Constants.SCORE_DIM);
        totalUpperNum.setText("0");
        
        grandTotalNum.setPreferredSize(core.Constants.SCORE_DIM);
        grandTotalNum.setText("0");
        
     
        round.setText("round");
        round.setPreferredSize(core.Constants.CATEGORY_DIM);
 
      
        totalLower.setText("Total Of Lower Sections");
        totalLower.setPreferredSize(core.Constants.CATEGORY_DIM);
                
        totalUpper.setPreferredSize(core.Constants.CATEGORY_DIM);
        totalUpper.setText("Total Of Upper Sections");
                
        grandTotal.setPreferredSize(core.Constants.CATEGORY_DIM);
        grandTotal.setText("Grand Total");
        
        this.addComponent( 0, 7, 1, 1, this, round);
        this.addComponent( 0, 8, 1, 1, this, totalLower);
        this.addComponent( 0, 9, 1, 1, this, totalUpper);
        this.addComponent( 0, 10, 1, 1, this, grandTotal);
        
        this.addComponent( 1, 7, 1, 1, this, roundNum);
        this.addComponent( 1, 8, 1, 1, this, totalLowerNum);
        this.addComponent( 1, 9, 1, 1, this, totalUpperNum);
        this.addComponent( 1, 10, 1, 1, this, grandTotalNum);

      
            linkedList.get(0).getCategory().setText("3 Of A Kind");
            linkedList.get(0).getScore().setText("add total of all dice");
            
            linkedList.get(1).getCategory().setText("4 Of A Kind");
            linkedList.get(1).getScore().setText("add Total of all dice");
            
            linkedList.get(2).getCategory().setText("Full House");
            linkedList.get(2).getScore().setText("Score 25");
            
            linkedList.get(3).getCategory().setText("Small Straight (Sequence of 4)");
            linkedList.get(3).getScore().setText("Score 30");
            
            
            linkedList.get(4).getCategory().setText("Large Straight (Sequence of 5");
            linkedList.get(4).getScore().setText("Score 40");
            
            linkedList.get(5).getCategory().setText("Yahtzee");
            linkedList.get(5).getScore().setText("Score 50");
            
            linkedList.get(6).getCategory().setText("Chance");
            linkedList.get(6).getScore().setText("Score Total of all 5 dice");
            

            
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
     
      private class CategoryAction implements ActionListener
   {
          JButton tempButton;
          
       public void actionPerformed(ActionEvent e)
       { 
           
        JOptionPane.showMessageDialog(null , e.getActionCommand()); 
        
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


}
