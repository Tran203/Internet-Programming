/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Customer_Order;

/**
 *
 * @author Student
 */
@Stateless
public class Customer_OrderFacade extends AbstractFacade<Customer_Order> implements Customer_OrderFacadeLocal {

    @PersistenceContext(unitName = "EJBModule1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Customer_OrderFacade() {
        super(Customer_Order.class);
    }
    
}
