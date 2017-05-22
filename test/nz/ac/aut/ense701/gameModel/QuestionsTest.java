/*
 * Author Glen Osborne 14852903 
 */
package nz.ac.aut.ense701.gameModel;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Glen Osborne test that the questions are being loaded correctly
 * ready for use with the stamina increase game to increase knowledge
 * for the player around conservation facts
 */
public class QuestionsTest {
    private Questions quest;
    private ArrayList<Question> kiwi;
    private ArrayList<Question> pests;
    
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
    //tear down tests
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
