package Term;

/*
 * Class functions:
 * 1) Constructor sets the private member variables of the class.
 * 2) getCoefficient returns the coefficient for the exponent.
 * 3) getExponent returns the exponent for the coefficient.
 * 4) toString returns the formatted string in the format given.
 */

public class Term {
	private int exponent,coefficient;
	public Term(int coefficient,int exponent){
		this.exponent = exponent;
		this.coefficient = coefficient;
	}
	
	public int getCoefficient(){
		if(this.coefficient == (int)this.coefficient){
			return this.coefficient;
		}
		else{
			System.out.println("Error! Not an integer");
			return -1;
		}
	}
	
	public int getExponent(){
		if(this.exponent == (int)this.exponent){
			return this.exponent;
		}
		else{
			System.out.println("Error!! Not an integer");
			return -1;
		}
	}
	
	public String toString(){
		String final_string = "";
		if(this.exponent == 0){
			final_string += Integer.toString(this.coefficient);
		}
		else if(this.exponent == 1){
			final_string += Integer.toString(this.coefficient)+"x";
		}
		else if(this.coefficient == 0){
			//No change
			
		}
		
		else if(this.coefficient == 1){
			final_string += "x^" + Integer.toString(this.exponent);
		}
		
		else{
			final_string += Integer.toString(this.coefficient) + "x^" + Integer.toString(this.exponent);
		}
		return final_string;
		
	}
}