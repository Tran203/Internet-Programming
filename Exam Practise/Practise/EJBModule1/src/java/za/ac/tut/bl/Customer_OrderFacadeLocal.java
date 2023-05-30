/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Customer_Order;

/**
 *
 * @author Student
 */
@Local
public interface Customer_OrderFacadeLocal {

    void create(Customer_Order customer_Order);

    void edit(Customer_Order customer_Order);

    void remove(Customer_Order customer_Order);

    Customer_Order find(Object id);

    List<Customer_Order> findAll();

    List<Customer_Order> findRange(int[] range);

    int count();
    
}
