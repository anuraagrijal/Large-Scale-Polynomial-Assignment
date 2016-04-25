package Test;
import Polynomial.Polynomial;
import java.io.*;

public class Test {
	public static void main(String[] args){
		int counter = 0;
		Polynomial poly_object = new Polynomial();
		String line = null,exponent_string = "",coefficient_string = "";
		int exponent = 0,coefficient = 0;
		File fileName = new File("source.txt");
		try{
			FileReader readFile = new FileReader(fileName);
			BufferedReader readBuffer = new BufferedReader(readFile);
			int length = readBuffer.read();
			if(length == -1){
				System.out.println("Error! Empty case");
			}
			else{
				while((line = readBuffer.readLine()) != null){
					String[] splitString = line.split(";");
					for(int i = 1; i<splitString.length; i++){
						if(i%2 != 0){
							coefficient_string = splitString[i];
							coefficient = Integer.parseInt(coefficient_string);
						}
						else{
							exponent_string = splitString[i];
							exponent = Integer.parseInt(exponent_string);
							poly_object.Insert(coefficient,exponent);
							
						}						
					}
					
					System.out.println("P(" + counter + ")" + " : " + poly_object.return_polynomial());
					System.out.println("Their product is : " + poly_object.Product());
					poly_object.Delete(5,3);
					System.out.println("After deletion: ");
					System.out.println("P(" + counter + ")" + " : " + poly_object.return_polynomial());
					System.out.println("After reversed: ");
					System.out.println("P(" + counter + ")" + " : " + poly_object.Reverse());
					System.out.println("Their product is : " + poly_object.Product());
					counter++;
					poly_object.clearArrayList();
					
				}
			}
			readBuffer.close();
			
			
		}
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		catch(IOException ex){
			System.out.println("ERROR : "+ex);
		}
	}

}