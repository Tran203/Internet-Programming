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
public interface QuestionPaperFacadeLocal {

    void create(QuestionPaper questionPaper);

    void edit(QuestionPaper questionPaper);

    void remove(QuestionPaper questionPaper);

    QuestionPaper find(Object id);

    List<QuestionPaper> findAll();

    List<QuestionPaper> findRange(int[] range);

    int count();
    
}
