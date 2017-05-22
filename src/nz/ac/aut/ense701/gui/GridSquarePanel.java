package nz.ac.aut.ense701.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gameModel.Occupant;
import nz.ac.aut.ense701.gameModel.Terrain;

/*
 * Panel for representing a single GridSquare of the island on the GUI.
 * 
 * @author AS
 * @version 1.0 - created
 */

public class GridSquarePanel extends javax.swing.JPanel 
{
    /** 
     * Creates new GridSquarePanel.
     * @param game the game to represent
     * @param row the row to represent
     * @param column the column to represent
     */
    public GridSquarePanel(Game game, int row, int column)
    {
        this.game   = game;
        this.row    = row;
        this.column = column;
        
        buildComponents();
    }

    /**
     * Updates the representation of the grid square panel.
     */
    public void update()
    {
        // get the GridSquare object from the world
        Terrain terrain   = game.getTerrain(row, column);
        boolean squareVisible = game.isVisible(row, column);
        boolean squareExplored = game.isExplored(row, column);
        
        ImageIcon terrianImg = new ImageIcon(terrain.getTerrainImage());
   /*     Color      color;
        
        switch ( terrain )
        {
            case SAND     : color = Color.YELLOW; break;
            case FOREST   : color = Color.GREEN;  break;
            case WETLAND : color = Color.BLUE; break;
            case SCRUB : color = Color.DARK_GRAY;   break;
            case WATER    : color = Color.CYAN;   break;
            default  : color = Color.LIGHT_GRAY; break;
        }*/
        
        if ( squareExplored || squareVisible )
        {
            // Set the image of the JLabel according to the occupant
            Occupant [] occupants = game.getGridOccupants(row,column);
            
            switch (occupants.length){
                case 1:
                    centreLabel.setIcon(null); 
                    leftLabel.setIcon(new ImageIcon(occupants[0].getOccImageIcon()));
                    rightLabel.setIcon(null);            
                    break;
                case 2:
                    centreLabel.setIcon(null);  
                    leftLabel.setIcon(new ImageIcon(occupants[0].getOccImageIcon()));
                    rightLabel.setIcon(new ImageIcon(occupants[1].getOccImageIcon())); 

                    break;
                case 3:
                    centreLabel.setIcon(null); 
                    leftLabel.setIcon(new ImageIcon(occupants[0].getOccImageIcon()));
                    rightLabel.setIcon(new ImageIcon(occupants[1].getOccImageIcon())); 

                    break;
                default:
                    centreLabel.setIcon(null); 
                    leftLabel.setIcon(null); 
                    rightLabel.setIcon(null); 
                    break;
            }
            
            // Set the colour. 
            if ( squareVisible && !squareExplored ) 
            {
         /*       // When explored the colour is brighter
                color = new Color(Math.min(255, color.getRed()   + 128), 
                                  Math.min(255, color.getGreen() + 128), 
                                  Math.min(255, color.getBlue()  + 128));*/
            }
            bgLabel.setIcon(terrianImg);
            // set border colour according to 
            // whether the player is in the grid square or not
            // and do the players icon
            setBorder(game.hasPlayer(row,column) ? activeBorder : normalBorder);
            if(game.hasPlayer(row,column)){
                centreLabel.setIcon(new ImageIcon(game.getPlayer().gPlayerImage().getScaledInstance(21, 51,
                            java.awt.Image.SCALE_SMOOTH)));
            }
            
        }
        else
        {
            bgLabel.setIcon(null);
            centreLabel.setIcon(null);
            leftLabel.setIcon(null);
            rightLabel.setIcon(null);
            setBorder(normalBorder);
        }
    }
    
    private void buildComponents() {

        bgLabel = new javax.swing.JLabel();
        leftLabel = new javax.swing.JLabel();
        rightLabel = new javax.swing.JLabel();
        centreLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.BorderLayout());
        
        bgLabel.setLayout(new BorderLayout());
        bgLabel.setPreferredSize(new java.awt.Dimension(62, 52));
        bgLabel.setOpaque(true);
        add(bgLabel);

        leftLabel.setPreferredSize(new java.awt.Dimension(20, 50));
        bgLabel.add(leftLabel, java.awt.BorderLayout.LINE_START);

        rightLabel.setPreferredSize(new java.awt.Dimension(20, 50));
        bgLabel.add(rightLabel, java.awt.BorderLayout.LINE_END);

        centreLabel.setPreferredSize(new java.awt.Dimension(20, 50));
        bgLabel.add(centreLabel, java.awt.BorderLayout.CENTER);
        
    }             
    
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel centreLabel;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JLabel rightLabel;     


    private Game game;
    private int row, column;
    
    private static final Border normalBorder = new LineBorder(Color.BLACK, 1);
    private static final Border activeBorder = new LineBorder(Color.RED, 3);
}
