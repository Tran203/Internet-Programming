/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Item;

/**
 *
 * @author MemaniV
 */
@Local
public interface ItemFacadeLocal {

    void create(Item item);

    void edit(Item item);

    void remove(Item item);

    Item find(Object id);

    List<Item> findAll();

    List<Item> findRange(int[] range);

    int count();
    
}
