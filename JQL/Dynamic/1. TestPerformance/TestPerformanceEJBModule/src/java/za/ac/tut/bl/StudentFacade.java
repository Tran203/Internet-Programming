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

    @PersistenceContext(unitName = "TestPerformanceEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public Integer cntAllMaleStd() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.GENDER = 'M' ORDER BY S.ID DESC");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Integer cntPassedAllMaleStd() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.PERCMARK >= 50.0 AND S.GENDER = 'M'");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Integer cntFailedAllMaleStd() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.PERCMARK < 50.0 AND S.GENDER = 'M'");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Integer cntAllFemaleStd() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.GENDER = 'F' ORDER BY S.ID DESC");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Integer cntPassedAllFemaleStd() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.PERCMARK >= 50.0 AND S.GENDER = 'F'");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Integer cntFailedAllFemaleStd() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.PERCMARK < 50.0 AND S.GENDER = 'F'");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public List<Student> findStudentWithinAgeRange(Integer min, Integer max) {
        //Query create
        Query query =  em.createQuery("SELECT S FROM STUDENT S "+ " WHERE S.AGE >= :minTarget AND S.AGE <= :maxTarget");
        //pass
        query.setParameter("minTarget", min);
        query.setParameter("maxTarget", max);
        
        //return studnent
        List<Student> students = query.getResultList();
        
        return students;
    }

    @Override
    public Double getHighestMArk() {
        //Query create
        Query query = em.createQuery("SELECT MAX(S.PERCMARK) FROM STUDENT S");
        Double mark = (Double)query.getSingleResult();
        
        return mark;
    }
    @Override
    public Double getLowestMark() {
        //Query create
        Query query = em.createQuery("SELECT MIN(S.PERCMARK) FROM STUDENT S");
        Double mark = (Double)query.getSingleResult();
        
        return mark;
    }

    @Override
    public Double getAvgMark() {
        //Query create
        Query query = em.createQuery("SELECT AVG(S.PERCMARK) FROM STUDENT S");
        Double mark = (Double)query.getSingleResult();
        
        return mark;
    }

    @Override
    public Integer cntAllPassed() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.percMark >= 50.0");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Integer cntAllFailed() {
        //Query create
        Query query = em.createQuery("SELECT COUNT(S) FROMS STUDENT S WHERE S.percMark < 50.0");
        //count
        Integer cnt = (Integer)query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Student findStudntUsingNames(String name, String surname) {
        //Query create
        Query query = em.createQuery("SELECT S FROM STUDENT S " + " WHERE S.NAME = :name AND S.SURNAME = :surname");
        
        //pass
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        
        //return student
        Student student = (Student)query.getSingleResult();
        
       return student;
    }
    
}
