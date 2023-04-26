/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Student
 */
@Stateful
public class CartSB implements CartSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private List<String> books = new ArrayList();

    @Override
    public void addBook(String bookName) {
        //add book
        books.add(bookName);
        //sys
        System.out.println("Book Name: " + bookName);
    }

    @Override
    public void removeBook(String bookName) {
        //remove book
        books.remove(bookName);
        //sys
        System.out.println("Book " + bookName + " was removed");
    }

    @Override
    public List<String> getBooks() {
        return books;
    }
    
    
    
    
    
    
    
    
    
}
