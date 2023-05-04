/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author Student
 */
public class TestData {
    private Integer qNum;
    private String question;
    private Integer userAnswer;
    private Integer answer;
    private String result;

    public TestData(Integer qNum, String question, Integer userAnswer, Integer answer, String result) {
        this.qNum = qNum;
        this.question = question;
        this.userAnswer = userAnswer;
        this.answer = answer;
        this.result = result;
    }

    public Integer getqNum() {
        return qNum;
    }

    public void setqNum(Integer qNum) {
        this.qNum = qNum;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(Integer userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
}
