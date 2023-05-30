/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.CustomerOrder;

/**
 *
 * @author MemaniV
 */
@Stateless
public class CustomerOrderFacade extends AbstractFacade<CustomerOrder> implements CustomerOrderFacadeLocal {

    @PersistenceContext(unitName = "FarmShopEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerOrderFacade() {
        super(CustomerOrder.class);
    }

    @Override
    public List<CustomerOrder> findAllOrdersByDate(Date date) {
        Query query = em.createQuery("SELECT co FROM CustomerOrder co WHERE co.creationDate =:targetDate ORDER BY co.orderValue DESC");
        query.setParameter("targetDate", date);
        List<CustomerOrder> co = query.getResultList();
        return co;
    }

    @Override
    public List<CustomerOrder> findAllByOrderValuesRange(Double minOrderValue, Double maxOrderValue) {
        Query query = em.createQuery("SELECT co FROM CustomerOrder co WHERE co.orderValue>=:targetMinOrderValue AND co.orderValue<=:targetMaxOrderValue ORDER BY co.orderValue DESC");
        query.setParameter("targetMinOrderValue", minOrderValue);
        query.setParameter("targetMaxOrderValue", maxOrderValue);
        List<CustomerOrder> co = query.getResultList();
        return co;
    }
    
}
