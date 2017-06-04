package nz.ac.aut.ense701.main;

import nz.ac.aut.ense701.gui.Menu;

/**
 * Kiwi Count Project
 * 
 * @author AS
 * @version 2011
 */
public class Main 
{
    /**
     * Main method of Kiwi Count.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
        //make spalsh screen
        final Menu menu = new Menu();
        // make the GUI visible
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                menu.setVisible(true);
            }
        });
    }
}


