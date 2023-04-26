/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

/**
 *
 * @author Student
 */
public class Calculator {

    public String getOutcome(Integer num1, Integer num2, Character op) throws ArithmeticOperatorException{
        String outcome ="";
        
        //operator
        if(isValid(op)){
            //calcate
            switch(op){
                case '+':
                    outcome = Integer.toString(num1 + num2);
                    break;
                case '/':
                    outcome = Integer.toString(num1 + num2);
                    break;
                case '*':
                    outcome = Integer.toString(num1 * num2);
                    break;
                default:
                    outcome = Integer.toString(num1 - num2);
            }
        }else{
            throw new ArithmeticOperatorException("The operator " + op + " is invalid");
            
        }
        
        
        return outcome;
    }

    private boolean isValid(Character op) {
        boolean valid =false;
        
        //check where op exist
        if(op == '+'|| op == '-' || op == '*' || op == '/'){
            valid = true;
        }
        
        return valid;
    }
    
}
