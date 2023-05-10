/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.AccountHolder;

/**
 *
 * @author Student
 */
@Stateless
public class AccountHolderFacade extends AbstractFacade<AccountHolder> implements AccountHolderFacadeLocal {

    @PersistenceContext(unitName = "AccountHolderEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountHolderFacade() {
        super(AccountHolder.class);
    }
    
}
