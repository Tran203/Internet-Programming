/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Items;

/**
 *
 * @author Student
 */
@Local
public interface ItemsFacadeLocal {

    void create(Items items);

    void edit(Items items);

    void remove(Items items);

    Items find(Object id);

    List<Items> findAll();

    List<Items> findRange(int[] range);

    int count();
    
}
