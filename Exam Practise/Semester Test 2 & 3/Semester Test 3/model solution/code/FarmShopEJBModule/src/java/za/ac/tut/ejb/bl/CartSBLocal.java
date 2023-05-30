/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MemaniV
 */
@Local
public interface CartSBLocal {
    
    void addItem(String item);
    
    List<String> getItems();
    
    List<String> emptyList();
    
    void setList(List<String> cart);
}
