/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author James Higgins
 */
public class GameInstructions {
    
    public static void instructions(){
        
       String str = parseInstructionFile("instructions/gameinstructions.txt");
        
        JOptionPane.showMessageDialog(null, str, "Game Instructions", JOptionPane.PLAIN_MESSAGE); 
        
    }
    
    public static String parseInstructionFile(String file){
        String output = "";
        try
        {
            output = "<html><body><ul><p style=\"color:#FF0000\" ;>Game Instructions</p><br>";
           // Open the file
            FileInputStream fileStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));

            String line;
            //Read File Line By Line
            while ((line = reader.readLine()) != null)   {
              output += "<li>"+line+"</li><br>";

            }
            
            output+="</ul></html></body>";
            //Close the input stream
            reader.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Couldnt find '" + file + "'");
        }
        catch(IOException e)
        {
            System.err.println("Problem encountered processing file.");
        }
        return output;
    }
}
