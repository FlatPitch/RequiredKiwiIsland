/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

/**
 *
 * @author Liandri
 */
public class IndividualQuestion {
    
    private String question = "";
    private boolean option1 = false;
    private boolean option2 = false;
    private boolean option3 = false;
    private boolean option4 = false;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isOption1() {
        return option1;
    }

    public void setOption1(boolean option1) {
        this.option1 = option1;
    }

    public boolean isOption2() {
        return option2;
    }

    public void setOption2(boolean option2) {
        this.option2 = option2;
    }

    public boolean isOption3() {
        return option3;
    }

    public void setOption3(boolean option3) {
        this.option3 = option3;
    }

    public boolean isOption4() {
        return option4;
    }

    public void setOption4(boolean option4) {
        this.option4 = option4;
    }
}
