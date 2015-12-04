/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Mark Paxson
 */
public class ScoreCardUi extends JPanel{
    
    /* class fields */
    private JLabel grandTotal = new JLabel();
    private LowerSectionUi lowerUi = new LowerSectionUi();
    private UpperSectionUi upperUi = new UpperSectionUi();
    
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints  c = new GridBagConstraints();
    
    
   
    
    
    
    public ScoreCardUi()
    {
        initComponents();
    }
    
    //this will be used to initialize the position for each component
    private void initComponents()
    {
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.weightx =1.0;
        c.weighty =1.0;
        
        //c.insets = new Insets(5,5,5,5);
        c.anchor = GridBagConstraints.CENTER;
        this.setLayout(gridBagLayout);
   
        
        //force a preferred size
        //grandTotal.setPreferredSize(core.Constants.CATEGORY_DIM);
      //  grandTotal.setLayout(layout);
        //add the component and use gridbag c
  
        
            
        this.addComponent(0, 0, 1, 1, this, upperUi);
        this.addComponent(0, 1,1,1, this, lowerUi);
        
        c.anchor = GridBagConstraints.CENTER;
        this.addComponent (1, 1, 1, 1, this, grandTotal);
        

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
