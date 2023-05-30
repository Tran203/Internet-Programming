/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author MemaniV
 */
@Stateless
public class CartSB implements CartSBLocal {

    private List<String> cart = new ArrayList<>();

    public CartSB() {
    }
    
    @Override
    public void addItem(String item) {
        cart.add(item);
    }

    @Override
    public List<String> getItems() {
        return cart;
    }
    
    @Override
    public List<String> emptyList() {
        cart.clear();
        return cart;
    }
    
    @Override
    public void setList(List<String> cart) {
        this.cart = cart;
    }

}
