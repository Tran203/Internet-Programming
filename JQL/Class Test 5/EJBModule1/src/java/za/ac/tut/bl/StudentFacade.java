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
        Query query = em.createQuery("SELECT S FROM Student S WHERE S.mark >= 50.0");
        List<Student> students = query.getResultList();

        return students;
    }

    @Override
    public Student higestStd() {
        //QUERY
        Query query = em.createQuery("SELECT S FROM Student S "
                + " WHERE S.mark = (SELECT MAX(S.mark) FROM Student S)");
        Student std = (Student) query.getSingleResult();
        return std;
    }

}
