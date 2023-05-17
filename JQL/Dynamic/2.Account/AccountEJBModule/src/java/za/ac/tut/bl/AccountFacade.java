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
import za.ac.tut.entities.Account;

/**
 *
 * @author Student
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "AccountEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }

    @Override
    public List<Account> findUsingBalance(Double balance) {
        //query
        Query query = em.createQuery("SELECT A FROM ACCOUNT A "+ " WHERE A.BALANCE >= :TargetAmt ");
        query.setParameter("TargetAmt", balance);
        List<Account> list = query.getResultList();
        
        return list;
    }
    
}
