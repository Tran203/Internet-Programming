/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Memo;

/**
 *
 * @author Student
 */
@Local
public interface MemoFacadeLocal {

    void create(Memo memo);

    void edit(Memo memo);

    void remove(Memo memo);

    Memo find(Object id);

    List<Memo> findAll();

    List<Memo> findRange(int[] range);

    int count();
    
}
