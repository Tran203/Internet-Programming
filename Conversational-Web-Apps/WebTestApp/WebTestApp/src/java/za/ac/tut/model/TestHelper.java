/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import jakarta.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TestHelper {

    public String getQuestion(List<String> questions, Integer count) {
    String[] questionTokens = questions.get(count).split(",");
    String question = questionTokens[0];
    
    return question;
    }
	
	//get correct answer from the list
	public Integer getCorrectAnswer(List<String> questions, Integer count){
	String[] questionTokens = questions.get(count).split(",");
	Integer correctAnswer = Integer.parseInt(questionTokens[1].trim());
	
	return correctAnswer;
	}	

    public String markUser(Integer answer, Integer correctAnswer, HttpSession session) {
        String outcome = "";
        //Mark
        if(answer.equals(correctAnswer)){
            outcome = "You are correct";
            Integer numCorrect = Integer.valueOf((String) session.getAttribute("numCorrect"));
            numCorrect++;
            //update marks
            session.setAttribute("numCorrect", numCorrect);
        }else{
            outcome = "You are wrong";
        }
        
        return outcome;
    }

    public String getNextPage(Integer count, Integer size) {
        String url="";
        if(count == size){
            url = "resultOutcome.jsp";
        }else{
            url = "nextQuestion.jsp";
        }
        
        return url;
    }
	
    
}
