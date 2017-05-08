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
    /**
     * Static method which creates a JOptionPane pop-up box containing the games instructions
     */
    public static void instructions(){
        
        String str = parseInstructionFile("instructions/gameinstructions.txt");   
        if(str != ""){
            JOptionPane.showMessageDialog(null, str, "Game Instructions", JOptionPane.PLAIN_MESSAGE); 

        }else{
            
            JOptionPane.showMessageDialog(null, "The default gameinstructions.txt file was not found", "Game Instructions", JOptionPane.PLAIN_MESSAGE); 

        }
     
    }
    /**
     * Reads a text file line by line, each line is then added to a string, also formats the text
     * into an HTML format.
     * 
     * @param file takes a String of where the file containing game instructions is located
     * @return a string containing the games instructions formatted with HTML   
    */
    public static String parseInstructionFile(String file){
        String output = "";
        try
        {
        
            // Open the file
            FileInputStream fileStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
            
            //Add html tags and the title for the popup box
            output = "<html><body><p style=\"color:#FF0000\" ;>Game Instructions</p><br>";
            
            String line;
            //Read File Line By Line, and add HTML formatting
            while ((line = reader.readLine()) != null)   {
              output += "<p>"+line+"</p><br>";

            }
            
            output+="</html></body>";
            //Close the input stream
            reader.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Couldnt find '" + file + "'");
        }
        catch(IOException e)
        {
            System.err.println("Could not process file.");
        }
        return output;
    }
}
