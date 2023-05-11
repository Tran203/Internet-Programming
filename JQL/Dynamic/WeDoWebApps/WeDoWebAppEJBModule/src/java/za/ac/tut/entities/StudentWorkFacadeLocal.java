/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student
 */
@Local
public interface StudentWorkFacadeLocal {

    void create(StudentWork studentWork);

    void edit(StudentWork studentWork);

    void remove(StudentWork studentWork);

    StudentWork find(Object id);

    List<StudentWork> findAll();

    List<StudentWork> findRange(int[] range);

    int count();
    
}
