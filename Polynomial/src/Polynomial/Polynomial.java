package Polynomial;
import Term.Term;
import java.util.*;

public class Polynomial {
	private ArrayList<Term> array;
	Term testCase;
	

	
	public Polynomial(){
		 array= new ArrayList<Term>();
	}
	
	public void Insert(int x, int y){
		
		testCase = new Term(x,y);
		
		if(array.size() == 0){
			array.add(testCase);
		}
		else{
			
			for(int i = 0;i < array.size();i++){
				Term index = array.get(i);
				int exponents = index.getExponent();
				if(y >= exponents){
					array.add(i,testCase);
					return;
				}
			}
			array.add(testCase);
		}
}

	public String return_polynomial(){
		int temp_counter = 0;
		String polynomial = "";
		for(Term iter: array){
			if(temp_counter == 0){
				polynomial += iter.toString();
			}
			else if(iter.getCoefficient()<0){
				polynomial += iter.toString();
			}
			else{
				polynomial += " + " + iter.toString();
			}
			temp_counter++;
			}
			return polynomial;
		
	}
	
	public void Delete(int x,int y){
		for(Term iter : array){
			if((iter.getCoefficient() == x)&&(iter.getExponent() == y)){
				array.remove(iter);
				System.out.println("Deleted. Coefficient : "+x + ". Exponent : "+y);
				return;
			}
			
		}
		System.out.println("Not found.  Coefficient : "+ x + ". Exponent : "+y);
	}
	
	public String Product(){
		String product = "";
		int coefficient = 1,exponents = 0;
		for(Term iter : array){
			int iter_coefficient = iter.getCoefficient();
			int iter_exponents = iter.getExponent();
			exponents += iter_exponents;
			coefficient *= iter_coefficient;
		}
		if(exponents == 0){
			product += Integer.toString(coefficient);
		}
		else if(coefficient == 1){
			product += "x^" + Integer.toString(exponents);
		}
		else{
			product += coefficient+"x^"+exponents;
		}
		return product;
		
		
		
	}
	
	public StringBuffer Reverse(){
		int temp_counter = 0;
		String temp = "";
		StringBuffer reverse_string = new StringBuffer("");
		for(Term iter : array){
			if(temp_counter == array.size()-1){
				temp += iter.toString();
			}
			else if(iter.getCoefficient()<0){
				temp += iter.toString();
			}
			else{
				temp += " + " + iter.toString();
			}
			
			reverse_string.insert(0, temp);
			temp = "";
			temp_counter++;
			
			
		}
		return reverse_string;
	}
	
	public void clearArrayList(){
		array.clear();
	}
	
}