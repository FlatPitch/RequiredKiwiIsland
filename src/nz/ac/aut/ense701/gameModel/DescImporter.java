/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * This class imports strings and images to be used for the Description
 * of the animals and fauna inside the game. It is used to enhance the game
 * experience and to share conservation messages with pictures to create
 * a positive association for the player
 * @author Liandri
 */
public class DescImporter {
    
   DescImporter(){
       
   }
   
   /**
    * This method read the strings from a data file and returns 
    * an ArrayList of descriptions to the game class
    * @return ArrayList<String> description
    */
   public ArrayList<String> readDesc(){
       ArrayList<String> description = new ArrayList<String>();
       BufferedReader br = null;
       try{
    br = new BufferedReader(new FileReader("desc.txt"));
    String line = "";
    while((line=br.readLine())!= null){
        description.add(line);
    }
    }catch(IOException io){
            System.out.println(io);
    }finally{
           try{
               if (br != null){
                   br.close();
               }
               }catch(IOException ie){
                  System.out.println("error closing file "+ ie);
            }
        }
       return description;
    }
   /**
    * This method imports the images and returns 
    * an ArrayList of ImageIcons to the game class
    * @return ArrayList<ImageIcons> descImages
    */
   public ArrayList<ImageIcon> importImages(){
       ArrayList<ImageIcon> descImages = new ArrayList<ImageIcon>();
       for(int i =1;i<=8;i++){                                                  //total number of images
           ImageIcon ii = new ImageIcon("/pics/"+i+".png");                     //make icons
           descImages.add(ii);                                                  //add to arrayList
       }
       return descImages;
   }
   
 }
