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
    
    public Questions(){
        buildKiwiQuestions();
        buildPestQuestions();
    }
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
                switch (count) {
                    case 0:
                        //first line
                        iq.setQuestion(line);
                        count++;
                        break;
                    case 1:
                        //second line
                        iq.setOption1(line);
                        count++;
                        break;
                    case 2:
                        //third line
                        iq.setOption2(line);
                        count++;
                        break;
                    case 3:
                        //fourthline
                        iq.setOption3(line);
                        count++;
                        break;
                    case 4:
                        //fithline
                        iq.setOption4(line);
                        count++;
                        break;
                    case 5:
                        //sixth line
                        answer = Integer.parseInt(line);
                        iq.setAnswer(answer);
                        kiwi.add(iq);
                        iq = new IndividualQuestion(); 
                        count = 0;
                        break;
                    default:
                        break;
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
                switch (count) {
                    case 0:
                        //first line
                        iq.setQuestion(line);
                        count++;
                        break;
                    case 1:
                        //second line
                        iq.setOption1(line);
                        count++;
                        break;
                    case 2:
                        //third line
                        iq.setOption2(line);
                        count++;
                        break;
                    case 3:
                        //fourthline
                        iq.setOption3(line);
                        count++;
                        break;
                    case 4:
                        //fithline
                        iq.setOption4(line);
                        count++;
                        break;
                    case 5:
                        //sixth line
                        answer = Integer.parseInt(line);
                        iq.setAnswer(answer);
                        pests.add(iq);
                        iq = new IndividualQuestion(); 
                        count = 0;
                        break;
                    default:
                        break;
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
    public void printAll(ArrayList<IndividualQuestion> q){
        for(int i =0;i<q.size();i++){
           System.out.println("question "+(i+1)+" value "+q.get(i).getQuestion());
        }
    }
}
