/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Order_Info;

/**
 *
 * @author Student
 */
@Stateless
public class Order_InfoFacade extends AbstractFacade<Order_Info> implements Order_InfoFacadeLocal {

    @PersistenceContext(unitName = "FarmEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Order_InfoFacade() {
        super(Order_Info.class);
    }
    
}
