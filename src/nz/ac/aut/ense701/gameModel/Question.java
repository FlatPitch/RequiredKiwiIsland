/*
 * This class holds the values for each question the options and answers
 */
package nz.ac.aut.ense701.gameModel;

/**
 *
 * @author Glen Osborne 14852903
 */
public class Question {

    private String question = "";
    private String option1 = "";
    private String option2 = "";
    private String option3 = "";
    private String option4 = "";   
    private int answer = 0;
    
    /**
     * create a question object for popup question UI
     * @param question the question to answer
     * @param opt1 the first option to select
     * @param opt2 the second question to select
     * @param opt3 the third option to select
     * @param opt4 the fourth option to select
     * @param answer the correct answer to the question
     */
    public Question(String question, String opt1, String opt2, String opt3, String opt4, int answer){
        this.question = question;
        this.option1 = opt1;
        this.option2 = opt2;
        this.option3 = opt3;
        this.option4 = opt4;
        this.answer = answer;
    }
    /**
     * 
     * @return the question to be asked 
     */
    public String getQuestion() {
        return question;
    }
    /**
     * 
     * @param question set the question to be asked
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    /**
     * 
     * @return the option 1 string
     */
    public String getOption1() {
        return option1;
    }
    /**
     * 
     * @param option1 set the option1 string
     */
    public void setOption1(String option1) {
        this.option1 = option1;
    }
    /**
     * 
     * @return the option2 string
     */
    public String getOption2() {
        return option2;
    }
    /**
     * 
     * @param option2 set the option2 string
     */
    public void setOption2(String option2) {
        this.option2 = option2;
    }
    /**
     * 
     * @return the option3 string
     */
    public String getOption3() {
        return option3;
    }
    /**
     * 
     * @param option3 set the option3 string
     */
    public void setOption3(String option3) {
        this.option3 = option3;
    }
    /**
     * 
     * @return the option4 string
     */
    public String getOption4() {
        return option4;
    }
    /**
     * 
     * @param option4 set the option4 string
     */
    public void setOption4(String option4) {
        this.option4 = option4;
    }
    /**
     * 
     * @return the answer value
     */
    public int getAnswer() {
        return answer;
    }
    /**
     * 
     * @param answer set the answer value
     */
    public void setAnswer(int answer) {
        this.answer = answer;
    }
    /**
     * test if selected answer is correct
     * @param answer
     * @return boolean
     */
    public boolean checkAnswer(int answer){
        return answer == this.answer;
    }
}
