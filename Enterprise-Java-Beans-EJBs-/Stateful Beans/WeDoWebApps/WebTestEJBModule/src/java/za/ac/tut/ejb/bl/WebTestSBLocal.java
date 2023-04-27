/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student
 */
@Local
public interface WebTestSBLocal {

    void recordQuestionAndAnswer(String question, String answer);

    void recordUserAnswerAndResult(String userAnswer, String result);

    List<String> getQuestions();
    
    List<String> getAnswers();
    
    List<String> getUserAnswers();
    
    List<String> getResults();
    
}
