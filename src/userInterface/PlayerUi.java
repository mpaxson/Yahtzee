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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mark Paxson
 */
public class PlayerUi extends JPanel{
    
    private JLabel playerName = new JLabel();
    private JLabel playerScore = new JLabel();
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();
    
    //Dimensions
    private Dimension playerNameDim= new Dimension(25, 25);
    private Dimension playerScoreDim = new Dimension( 25, 25);
    
    public PlayerUi()
    {
        initComponents();
    }
    
    private void initComponents()
    {
        c.weightx =0.75;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        this.setLayout(gridBagLayout);
        this.setBorder(core.Constants.BLACK_LINE);
       // playerName.setLayout(gridBagLayout);
       // playerScore.setLayout(gridBagLayout);
        
        playerName.setPreferredSize(core.Constants.TOP_ROW_DIM);
        playerName.setText("Name");
        
        playerScore.setPreferredSize(core.Constants.TOP_ROW_DIM);
        playerScore.setText("Score");

        
        this.addComponent(0, 0, 1, 1, this, playerName);
        this.addComponent(1, 0, 1, 1, this, playerScore);
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
