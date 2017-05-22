/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import java.awt.GridLayout;
import java.util.Enumeration;
import javax.swing.AbstractButton;
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
    SoundsSingleton sound;

    public PopupQuestion() {
        this.sound = new SoundsSingleton();
    }
    public boolean makePopup(Question question){
        boolean selected = false;
        JRadioButton radiobutton1;
        JRadioButton radiobutton2;
        JRadioButton radiobutton3;
        JRadioButton radiobutton4;
        final JPanel panel = new JPanel(new GridLayout(6,0));
        final JLabel quest = new JLabel(question.getQuestion());
        radiobutton1 = new JRadioButton(question.getOption1());
        radiobutton2 = new JRadioButton(question.getOption2());
        radiobutton3 = new JRadioButton(question.getOption3());
        radiobutton4 = new JRadioButton(question.getOption4());
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
        int radiobuttonNumber = 0;
        for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            radiobuttonNumber++;
            if (button.isSelected()) {
                if (question.checkAnswer(radiobuttonNumber)){
                    sound.playCorrect();
                    return true;
                }else{
                    sound.playWrong();
                }
            }
        }
        return false;
    }
}
