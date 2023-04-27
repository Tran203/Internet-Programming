/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;

/**
 *
 * @author Student
 */
@Stateless
public class CurrencyConvertorSB implements CurrencyConvertorSBLocal {
    //custom RATE
    private final Double RATE = 20.00;

    @Override
    public Double convertToDollar(double amt) {
        Double dollar = amt / RATE;
        return dollar;
    }

    @Override
    public Double convertToRand(double amt) {
        Double rand = amt * RATE;
        return rand;
    }
    
}
