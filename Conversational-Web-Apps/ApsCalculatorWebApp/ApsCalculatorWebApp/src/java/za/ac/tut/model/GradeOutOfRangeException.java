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
public class GradeOutOfRangeException extends RuntimeException{

    GradeOutOfRangeException(String string) {
        super(string);
    }
    
}
