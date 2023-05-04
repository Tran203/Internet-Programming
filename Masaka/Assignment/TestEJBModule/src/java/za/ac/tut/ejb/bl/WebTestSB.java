/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import za.ac.tut.model.TestData;

/**
 *
 * @author Student
 */
@Stateful
public class WebTestSB implements WebTestSBLocal {
    //Custom data
    List<TestData> data = new ArrayList();

    @Override
    public void recordData(TestData question) {
        data.add(question);
    }

    @Override
    public List<TestData> getData() {
        return data;
    }

    
    
    
    
    
}
