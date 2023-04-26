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
public class SubjectCheck {

    public String check(String sbjName, Integer grade, HttpSession session){

        String status = "aps for LO is not calculated";
        //check the name for LO
        if(!(sbjName.equalsIgnoreCase("life orientantion"))){
            //check for grade
            if ((grade <= 100) && (grade > 0)) {
                Integer subjAps = getSubAps(grade);
                //get data from the session
                Integer apsCount = (Integer) session.getAttribute("apsCount");
                apsCount += subjAps;
                
                //pass aps back to the session
                session.setAttribute("apsCount", apsCount);
                status = "details for " + sbjName +" captured successfully";
            } else {
                status = "data not captured";
            }
        }
        return status;
    }

    public int getSubAps(Integer grade) {
        Integer aps;
        if (grade <= 29) {
            aps = 1;
        } else if (grade <= 39) {
            aps = 2;
        } else if (grade <= 49) {
            aps = 3;
        } else if (grade <= 59) {
            aps = 4;
        } else if (grade <= 69) {
            aps = 5;
        } else if (grade <= 79) {
            aps = 6;
        } else {
            aps = 7;
        }
        return aps;
    }

}
