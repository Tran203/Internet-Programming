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
    List<QuestionHistory> question = new ArrayList();
    
    
    
    
    
}
