/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author Admin
 */
public class AgeCategory {
    public String ageResult(Integer age){
        String result = "";
        if(age < 14){
            result = "a Child";
        }else if(age < 24){
            result = "a Youth";
        }else if(age <64){
            result = "an Adult";
        }else{
            result= "a Senior";
        }
        return "You are classified as "+ result;
    }
}
