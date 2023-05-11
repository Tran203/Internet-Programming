/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Student;

/**
 *
 * @author Student
 */
@Local
public interface StudentFacadeLocal {

    void create(Student student);

    void edit(Student student);

    void remove(Student student);

    Student find(Object id);

    List<Student> findAll();

    List<Student> findRange(int[] range);
    
    //user
    
    //MALE
    Integer cntAllMaleStd();
    Integer cntPassedAllMaleStd();
    Integer cntFailedAllMaleStd();
    
    //fEMALE
    Integer cntAllFemaleStd();
    Integer cntPassedAllFemaleStd();
    Integer cntFailedAllFemaleStd();
    
    //ALL STUDENT GENEARAL DATA
    Student findStudntUsingNames(String name, String surname);
    List<Student> findStudentWithinAgeRange(Integer min, Integer max);
    Integer cntAllPassed();
    Integer cntAllFailed();
    
    //
    Double getHighestMArk();
    Double getLowestMark();
    Double getAvgMark();

    int count();
    
}
