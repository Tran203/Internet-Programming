/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class Calculator {

    public String getQustion(String choice,HttpSession session) {
        Integer min, max;
        //check for mult
        if (choice.equalsIgnoreCase("Multiplication")) {
            min = 1;
            max = 10;
        } else {
            min = 10;
            max = 90;
        }

        //generate numbers
        Integer num1 = getNumber(min, max);
        Integer num2 = getNumber(min, max);

        String op = getOpeartion(choice);

        Integer answer = getAnswer(num1, num2, choice);
        session.setAttribute("answer", answer);
        
        String question = num1 + " " + op + " " + num2;
        return question;
    }

    private Integer getNumber(Integer min, Integer max) {
        Integer number = min + (int) (Math.random() * max);

        return number;
    }

    private String getOpeartion(String choice) {
        String op;
        switch (choice.toLowerCase()) {
            case "addition":
                op = "+";
                break;
            case "subtraction":
                op = "-";
                break;
            case "division":
                op = "/";
                break;
            default:
                op = "*";
        }

        return op;
    }

    private Integer getAnswer(Integer num1, Integer num2, String choice) {
        Integer answer;
        switch (choice.toLowerCase()) {
            case "addition":
                answer = num1 + num2;
                break;
            case "subtraction":
                answer = num1 - num2;
                break;
            case "division":
                answer = num1 / num2;
                break;
            default:
                answer = num1 * num2;

        }
        return answer;
    }

}