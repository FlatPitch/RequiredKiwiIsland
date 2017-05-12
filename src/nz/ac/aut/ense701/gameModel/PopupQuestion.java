/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import java.awt.GridLayout;
import javafx.scene.layout.VBox;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Liandri
 */
public class PopupQuestion {
    
    public boolean makePopup(IndividualQuestion currentQuestion){
        boolean selected = false;
        JRadioButton radiobutton1;
        JRadioButton radiobutton2;
        JRadioButton radiobutton3;
        JRadioButton radiobutton4;
        final JPanel panel = new JPanel(new GridLayout(6,0));
        final JLabel quest = new JLabel(currentQuestion.getQuestion());
        radiobutton1 = new JRadioButton(currentQuestion.getOption1());
        radiobutton2 = new JRadioButton(currentQuestion.getOption2());
        radiobutton3 = new JRadioButton(currentQuestion.getOption3());
        radiobutton4 = new JRadioButton(currentQuestion.getOption4());
        ButtonGroup group = new ButtonGroup();
        group.add(radiobutton1);
        group.add(radiobutton2);
        group.add(radiobutton3);
        group.add(radiobutton4);
        panel.add(quest);
        panel.add(radiobutton1);
        panel.add(radiobutton2);
        panel.add(radiobutton3);
        panel.add(radiobutton4);
        JOptionPane.showMessageDialog(null, panel);
        if(radiobutton1.isSelected()){
            if(currentQuestion.getAnswer()==1){
                selected = true;
            }
        }else if(radiobutton2.isSelected()){
            if(currentQuestion.getAnswer()==2){
                selected = true;
            }
        }else if(radiobutton3.isSelected()){
            if(currentQuestion.getAnswer()==3){
                selected = true;
            }
        }else if(radiobutton4.isSelected()){
            if(currentQuestion.getAnswer()==4){
                selected = true;
            }
        }
        return selected;
    }
}
