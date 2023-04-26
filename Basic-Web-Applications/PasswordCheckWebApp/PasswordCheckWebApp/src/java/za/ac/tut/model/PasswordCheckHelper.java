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
public class PasswordCheckHelper {

    public String checkMyPassword(String password) throws PasswordErrorException {
        String status = "Not Approved";
        //1st check size
        if (password.length() >= 10) {
            //now check for letter, digits
            int upper = 0;
            int lower = 0;
            for (int i = 0; i < password.length(); i++) {
                Character c = password.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    if (Character.isUpperCase(c)) {
                        upper++;
                    } else {
                        lower++;
                    }
                } else if (c == '@' || c == '#') {
                } else {
                    //special
                }
            }
            //calc(Do the math)
            if (upper > 1 && lower > 1) {
                status = "Aproved";
            }
        } else {
            throw new PasswordErrorException("The password length is less than 10 digits");
        }
        return status;
    }

}
