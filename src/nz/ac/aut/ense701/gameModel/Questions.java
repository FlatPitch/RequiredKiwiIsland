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

    private ArrayList<IndividualQuestion> kiwi = new ArrayList<IndividualQuestion>();
    private ArrayList<IndividualQuestion> pests = new ArrayList<IndividualQuestion>();

    public void buildKiwiQuestions() {
        IndividualQuestion iq;// = new IndividualQuestion();
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
                    System.out.println("kiwi array size "+kiwi.size());
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
        IndividualQuestion iq;// = new IndividualQuestion();
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
                    System.out.println("pests array size "+pests.size());
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
    public void printOut(){
        for(int i=0;i<kiwi.size();i++){
            System.out.println(kiwi.get(i).getQuestion());
            System.out.println(kiwi.get(i).getOption1());
            System.out.println(kiwi.get(i).getOption2());
            System.out.println(kiwi.get(i).getOption3());
            System.out.println(kiwi.get(i).getOption4());
            System.out.println(kiwi.get(i).getAnswer());
        }
        for(int i=0;i<pests.size();i++){
            System.out.println(pests.get(i).getQuestion());
            System.out.println(pests.get(i).getOption1());
            System.out.println(pests.get(i).getOption2());
            System.out.println(pests.get(i).getOption3());
            System.out.println(pests.get(i).getOption4());
            System.out.println(pests.get(i).getAnswer());
        }
    }
}
