/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class generates the questions and answers class to provide for the
 * answer questions for stamina functionality
 *
 * @author Glen Osborne
 */
public class Questions {
    //questions ready for display
    private ArrayList<IndividualQuestion> kiwi = new ArrayList<IndividualQuestion>();
    private ArrayList<IndividualQuestion> pests = new ArrayList<IndividualQuestion>();
    //build the questions and options for the kiwi questions
    public void buildKiwiQuestions() {
        IndividualQuestion iq;
        BufferedReader br = null;
        int count = 0;
        int answer = 0;
        //generate kiwi questions
        iq = new IndividualQuestion();
        count = 0;
        try {
            br = new BufferedReader(new FileReader("questions/kiwiQuestions.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (count == 0) {             //first line
                    iq.setQuestion(line);
                    count++;
                } else if (count == 1) {         //second line
                    iq.setOption1(line);
                    count++;
                } else if (count == 2) {          //third line
                    iq.setOption2(line);
                    count++;
                } else if (count == 3) {         //fourthline
                    iq.setOption3(line);
                    count++;
                } else if (count == 4) {        //fithline
                    iq.setOption4(line);
                    count++;
                } else if (count == 5) {        //sixth line
                    answer = Integer.parseInt(line);
                    iq.setAnswer(answer);
                    kiwi.add(iq);
                    count = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
        public void buildPestQuestions() {
        IndividualQuestion iq;
        BufferedReader br = null;
        int count = 0;
        int answer = 0;
        //generate kiwi questions
        iq = new IndividualQuestion();
        count = 0;
        try {
            br = new BufferedReader(new FileReader("questions/pestQuestions.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (count == 0) {             //first line
                    iq.setQuestion(line);
                    count++;
                } else if (count == 1) {         //second line
                    iq.setOption1(line);
                    count++;
                } else if (count == 2) {          //third line
                    iq.setOption2(line);
                    count++;
                } else if (count == 3) {         //fourthline
                    iq.setOption3(line);
                    count++;
                } else if (count == 4) {        //fithline
                    iq.setOption4(line);
                    count++;
                } else if (count == 5) {        //sixth line
                    answer = Integer.parseInt(line);
                    iq.setAnswer(answer);
                    pests.add(iq);
                    count = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
        
    public ArrayList<IndividualQuestion> getKiwiQuestionsArray() {
        return kiwi;
    }

    public ArrayList<IndividualQuestion> getPestsQuestionsArray() {
        return pests;
    }
}
