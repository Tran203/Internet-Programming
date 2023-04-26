package za.ac.tut.model;

public class Calculation{
	//constructor
	public Calculation(){
		
	}
	
	//addition
	public Integer Add(Integer num1, Integer num2){
		Integer result;
		
		result = num1 + num2;
		
		return result;
	}
	
	//subtraction
	public Integer Sub(Integer num1, Integer num2){
		Integer result;
		
		result = num1 - num2;
		
		return result;
	}
	
	//multiply
	public Integer Mult(Integer num1, Integer num2){
		Integer result;
		
		result = num1 * num2;
		
		return result;
	}
	
	//division
	public Integer Div(Integer num1, Integer num2){
		Integer result;
		
		result = num1 / num2;
		
		return result;
	}
	
}
