/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Liandri
 */
public class QuestionsTest {
    private Questions quest;
    private ArrayList<IndividualQuestion> kiwi;
    private ArrayList<IndividualQuestion> pests;
    
    public QuestionsTest(){
        //defult constructor
    }
    //set up for tests
    @Before
    public void setUp() {
        quest = new Questions();
        kiwi = quest.getKiwiQuestionsArray();
        pests = quest.getPestsQuestionsArray();
    }
    @After
    public void tearDown(){
        quest = null;
        kiwi = null;
        pests = null;
    }
    @Test
    public void kiwiQuestionAndAnswerMatchFirst() {

        assertEquals(kiwi.get(0).getAnswer(), 2);
    }
    @Test
    public void kiwiQuestionAndAnswerMatchLast()  {

        assertEquals(kiwi.get(7).getAnswer(), 3);
    }
    @Test
    public void kiwiOptionMatchesFirst()  {

        assertEquals(kiwi.get(0).getOption1(), "10%");
    }
    @Test
    public void kiwiOptionMatchesLast()  {

        assertEquals(kiwi.get(7).getOption1(), "not at all");
    }
    @Test
    public void pestsQuestionAndAnswerMatchFirst()  {

        assertEquals(pests.get(0).getAnswer(), 1);
    }
    @Test
    public void pestsQuestionAndAnswerMatchLast()  {

        assertEquals(pests.get(7).getAnswer(), 1);
    }
    @Test
    public void pestsOptionMatchesFirst()  {

        assertEquals(pests.get(0).getOption1(), "Possums");
    }
    @Test
    public void pestsOptionMatchesLast()  {

        assertEquals(pests.get(7).getOption1(), "Rabbits");
    }
}
