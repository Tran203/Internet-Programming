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
public class TicketSaleSingleton implements TicketSaleSingletonLocal {
    //set Custom tickets num
    private Integer availableTickets = 10;

    @Override
    public Integer getTickets(Integer numRequestedTickets) {
        Integer numIssuedTickets;
        
        //check requirements
        if(numRequestedTickets > availableTickets){
            numIssuedTickets = availableTickets;
        }else{
           numIssuedTickets =  numRequestedTickets;
        }
        
        availableTickets -= numIssuedTickets;
       
        return numIssuedTickets;
    }

    @Override
    public Integer getAvailableTickets() {
        return availableTickets;
    }
    
    
}
