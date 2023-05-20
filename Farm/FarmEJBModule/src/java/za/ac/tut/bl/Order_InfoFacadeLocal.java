/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Order_Info;

/**
 *
 * @author Student
 */
@Local
public interface Order_InfoFacadeLocal {

    void create(Order_Info order_Info);

    void edit(Order_Info order_Info);

    void remove(Order_Info order_Info);

    Order_Info find(Object id);

    List<Order_Info> findAll();

    List<Order_Info> findRange(int[] range);

    int count();
    
}
