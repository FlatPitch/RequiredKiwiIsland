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
 * @author Glen Osborne
 */
public class DescImporter {

   /**
    * This method imports the images and returns 
    * an ArrayList of ImageIcons to the game class
    * @return ArrayList<ImageIcons> descImages
    */
   public ArrayList<String> importImages(){
       ArrayList<String> descImages = new ArrayList<String>();
       for(int i =0;i<=14;i++){                                                  //total number of images
           String imgLoc = "/nz/ac/aut/ense701/gui/images//"+i+".jpg";                     //make icons
           descImages.add(imgLoc);                                                  //add to arrayList
       }
       return descImages;
   }
 }
