/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Student;

/**
 *
 * @author Student
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "EJBModule1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public List<Student> stdWhoPassed() {
        //query
        Query query = em.createQuery("SELECT s FROM STUDENT S WHERE S.MARK >= 50.0");
        List<Student> students = query.getResultList();
        
        return students;
    }

    @Override
    public Student higestStd() {
        //QUERY
        Query query = em.createQuery("SELECT s FROM STUDENT s " + " WHERE s.MARK = (SELECT MAX(s.MARK) FROM STUDENT s)");
        Student std = (Student)query.getSingleResult();
        return std;
    }
    
}
