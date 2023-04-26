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
public class ArithmeticOperator {

    public String getResult(Integer num1, Integer num2, Character op) throws ArithmeticOperatorException {
        String result = "";
        //check if op is valid
        if(isValid(op)){
            //calculate
            switch(op){
                case '+':
                    result = Integer.toString(num1 + num2);
                    break;
                case '-':
                    result = Integer.toString(num1 - num2);
                    break;
                case '*':
                    result = Integer.toString(num1 * num2);
                    break;
                default:
                    result = Double.toString((double)num1/num2);
            }
        }else{
            throw new ArithmeticOperatorException("The opertor "+ op+ " is inValid");
        }
        return result;
    }

    private boolean isValid(Character op) {
        boolean isValid = false;
    
        //check where op exist
        if(op == '+'|| op == '-' || op == '*' || op == '/'){
            isValid = true;
        }
        
        return isValid;
    }
    
}
