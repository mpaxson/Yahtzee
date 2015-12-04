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
public class GameUi extends JPanel {
    /*Class Fields*/
    private JLabel round = new JLabel();
    private JLabel gameTurn = new JLabel();
    private JLabel logo = new JLabel();
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();
    
    
    /*
        Dimensions  */
    private Dimension roundDim = new Dimension(50,50);

                
    private Dimension gameTurnDim= new Dimension ( 50 , 25 );
    
    private Dimension logoDim= new Dimension( 25 , 25 );
    
    public GameUi()
    {
        initComponents();
        
    }
    
    private void initComponents()
    {
        c.weightx =0.75;
        
        
        this.setLayout(gridBagLayout);
        this.setBorder(core.Constants.BLACK_LINE);

        //initialize layouts
//        round.setLayout(gridBagLayout);
//        gameTurn.setLayout(gridBagLayout);
//        logo.setLayout(gridBagLayout);
        
        //dimensions
        round.setPreferredSize(core.Constants.TOP_ROW_DIM);
        gameTurn.setPreferredSize(core.Constants.TOP_ROW_DIM);
        logo.setPreferredSize(core.Constants.TOP_ROW_DIM);
        
        round.setText("Round #");
        gameTurn.setText("Turn #");
        logo.setText("Logo");
       
           
        this.addComponent(0, 0, 1, 1, this, round);
        this.addComponent(1, 0, 1, 1, this, gameTurn);
        this.addComponent(2, 0, 1, 1, this, logo);
        
        
        
        
        
        
    }
    
    //function
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
