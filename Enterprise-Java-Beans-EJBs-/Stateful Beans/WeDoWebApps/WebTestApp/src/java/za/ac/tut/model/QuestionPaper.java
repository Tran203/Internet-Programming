/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.WebTestSBLocal;

/**
 *
 * @author Student
 */
public class QuestionPaper {
    
    public String getQuestion(HttpSession session, String testOption) {
        String question = "";

        //follow rules
        Integer min = 10;
        Integer max = 90;

        if (testOption.equalsIgnoreCase("multiplication")) {
            min = 1;
            max = 10;
        }

        //Now Lets get Our Numbers
        Integer num1 = getNumber(min, max);
        Integer num2 = getNumber(min, max);

        //lets get the operator
        String op = getOperator(testOption);

        //write the whole question to user
        question = num1 + " " + op + " " + num2;

        //get the answer
        Integer answer = getAnswer(num1, num2, op);
        
        //record data
        WebTestSBLocal record = (WebTestSBLocal)session.getAttribute("record");
        record.recordQuestionAndAnswer(question, answer);
        
        //pass into session
        session.setAttribute("record", record);
        session.setAttribute("answer", answer);
        
        return question;
    }

    private Integer getNumber(Integer min, Integer max) {
        //randomise the number
        Integer num = min + (int) (Math.random() * max);

        return num;
    }

    private String getOperator(String testOption) {
        String op = "+";

        if (testOption.equalsIgnoreCase("multiplication")) {
            op = "*";
        } else if (testOption.equalsIgnoreCase("subtraction")) {
            op = "-";
        } else if (testOption.equalsIgnoreCase("division")) {
            op = "/";
        }

        return op;
    }

    private Integer getAnswer(Integer num1, Integer num2, String op) {
        Integer answer;

        switch (op.charAt(0)) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                answer = num1 * num2;
        }
        
        return answer;
    }
    
}
