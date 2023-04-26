/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author Admin
 */
public class CurrencyConvertor {

    public Double convertorMethod(Double amt, String rate) {
        Double newAmt;
        //validate the conversion rate
        if(rate.equalsIgnoreCase("Zar to Usd")){
            newAmt = getUsd(amt);
        }else{
            newAmt = getZar(amt);
        }
        return newAmt;
    }

    private Double getZar(Double amt) {
        Double newAmt;
        //convert to usd
        newAmt = amt * 10;
        
        return newAmt;
    }

    private Double getUsd(Double amt) {
        Double newAmt;
        //convert to usd
        newAmt = amt/10;
        
        return newAmt;
    }
    
}
