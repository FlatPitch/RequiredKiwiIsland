/*
 *Author Glen Osborne 14852903
 *This code is for educational puposes only 
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
    private ArrayList<Question> kiwi = new ArrayList<Question>();
    private ArrayList<Question> pests = new ArrayList<Question>();

    //build the questions and options for the kiwi questions
    public Questions() {
        buildKiwiQuestions();
        buildPestQuestions();
    }

    /**
     * generate the questions for the Kiwi conservation question and make array
     * list so that a random question can be asked for a chance to increase
     * stamina
     */
    private void buildKiwiQuestions() {
        Question iq;
        BufferedReader br = null;
        int count = 0;
        int answer = 0;
        //generate kiwi questions
        
        /**TO FIX
         * MOVE THIS METHOD TO THE GAME CLASS
         * top line of kiwi / peast questions txt file add a number telling how many lines of questions are below
         * read and store that number and then for loop that many times
         * each loop should create a new Question object and pass through its required variables
         * store taht Question object into a kiwi or pest questions array list
        */
        
        iq = new Question();
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
                        iq = new Question();
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

    /**
     * generate the questions for the pest conservation question and make array
     * list so that a random question can be asked for a chance to increase
     * stamina
     */
    private void buildPestQuestions() {
        Question iq;
        BufferedReader br = null;
        int count = 0;
        int answer = 0;
        //generate kiwi questions
        iq = new Question();
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
                        iq = new Question();
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

    public ArrayList<Question> getKiwiQuestionsArray() {
        return kiwi;
    }

    public ArrayList<Question> getPestsQuestionsArray() {
        return pests;
    }

    public void printAll(ArrayList<Question> q) {
        for (int i = 0; i < q.size(); i++) {
            System.out.println("question " + (i + 1) + " value " + q.get(i).getQuestion());
        }
    }
}
