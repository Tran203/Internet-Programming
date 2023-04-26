/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuestionBank {
    public List<String> getQuestions(){
        List<String> questions = new ArrayList<>();
        //create questions and answers
        questions.add("1 + 1 = ?, 2");
        questions.add("4 * 4 = ?, 16");
        questions.add("50 / 2 = ?, 25");
        questions.add("100 * 3 = ?, 300");
        
        return questions;
    }
}
