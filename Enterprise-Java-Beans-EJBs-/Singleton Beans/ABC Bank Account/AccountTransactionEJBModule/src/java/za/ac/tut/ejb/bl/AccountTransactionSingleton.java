/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Singleton;

/**
 *
 * @author Student
 */
@Singleton
public class AccountTransactionSingleton implements AccountTransactionSingletonLocal {
    //initial amount
    private Double balance = 1000.0;

    @Override
    public Double checkBalance() {
        return balance;
    }

    @Override
    public void deposit(double amt) {
        balance += amt;
    }

    @Override
    public Double withdraw(double amt) {
        Double amtGot;
        if(amt > balance){
            amtGot = balance;
        }else{
            amtGot = amt;
        }
        //withdraw
        balance -= amtGot;
        
        return amtGot;
    }
    
    
}
