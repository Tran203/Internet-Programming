/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Student
 */
@Stateful
public class WebTestSB implements WebTestSBLocal {
    //Custom data
    private List<String> questions = new ArrayList();
    private List<String> answers = new ArrayList();
    private List<String> userAnswers = new ArrayList();
    private List<String> results = new ArrayList();

    @Override
    public void recordQuestionAndAnswer(String question, String answer) {
        questions.add(question);
        answers.add(answer);
    }

    @Override
    public void recordUserAnswerAndResult(String userAnswer, String result) {
        userAnswers.add(userAnswer);
        results.add(result);
    }

    @Override
    public List<String> getQuestions() {
        return questions;
    }
    
    @Override
    public List<String> getAnswers() {
        return answers;
    }
    
    @Override
    public List<String> getUserAnswers() {
        return userAnswers;
    }
    
    @Override
    public List<String> getResults() {
        return results;
    }
    
    
    
    
    
}
