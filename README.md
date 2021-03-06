# Large-Scale-Polynomial-Assignment

HOWARD UNIVERSITY
DEPARTMENT OF SYSTEMS AND COMPUTER SCIENCE
SPRING 2016

Large Scale Programming
Phone Directory Assignment – Due: 4/21/16

												

Problem Description

This assignment provides exposure to using Java collections, more specially, ArrayList.

I.	The Term Class

Create a class to represent a term in an algebraic expression. As defined here, a term consists of an integer coefficient and a nonnegative integer exponent.  E.g.

•	in the term 4x2, the coefficient is 4 and the exponent 2
•	in -6x8, the coefficient is -6 and the exponent 8

Your Term class will have a constructor that creates a Term object with a coefficient and exponent passed as parameters, accessor methods that return the coefficient and the exponent. Your class will also have a toString() method that returns a Term object as a String, formatted as shown in these examples:

Coefficient		Exponent		returns
     5			   3			 5x^3
     8			   1			 8x
     4			   0			 4


II.	The Polynomial Class

Now create a class to represent a polynomial.  As defined here, a polynomial is a sequence of terms.  E.g.

1.	3x2  +  4x4  +  x6 
2.	2  +  5x2  +  6x3  +  2x7 
3.	4x10 

The terms of polynomial 1 are (3,2), (4,4) and (1,6). The terms of polynomial 2 are (2,0), (5,2), (6,3) and (2,7). Polynomial 3 has only one term (4,10)

	To receive credit for this assignment, your class must use a generic “ArrayList of Term” to store the terms of a Polynomial object

Your class will have a constructor that creates an empty list and additional methods to do each of the following:

insert a new term in its proper place in a polynomial (see “Additional Specifications,” below)

1.	return all the terms of a polynomial as a single line string, as shown here:

		3x^2 + 4x^4 + x^6

Hint: for each Term in the Polynomial, call the toString() method of the Term class and concatenate 		

2.	delete a term from a polynomial (see “Additional Specifications,” below)

3.	compute and return the product of all the terms of a polynomial

4.	reverse the order of the terms in a polynomial (see “Additional Specifications,” below)

III.	The Test Class

The main method of your test class will create a Polynomial object and then read and process a series of operations until end of file.  You should choose a reasonable file layout of your polynomial input so that it can be read into your program.  Any questions should be posted to the class wiki.

The operations are:

1. INSERT X Y

	Insert a new term with coefficient X and exponent Y into its proper place in the polynomial

2. DELETE X Y  

	Remove the term with coefficient X and exponent Y from the polynomial.  
 
3. REVERSE  

	Reverse the order of the terms of the polynomial

4. PRODUCT

	Compute and return the product of all the terms

	Each operation is to be carried out by calling a method of the Polynomial class

	Each operation read must be “echo printed” to the screen

	After each operation, print the updated polynomial by calling the toString() method

	For the PRODUCT operation, print the string returned


IV.	Additional Specifications

1.	All instance variables must be private

2.	Assume your input file is formatted as the following:

		P1;8;0;-4;1;5;3
		P2;6;5;7:1-2;2;-4;0
	   
   	  Your program should produce:

		P1(X) = 5X^3 –4X +8
		P2(X) = 6X^5 -2X^2 +7X -4

	  Notice that the exponents in the input for P2 are not      
    necessarily in ascending order.  Your insert method in your    
    Polynomial class should account for this input.

3.	You may assume correct input

4.	Regarding the delete() method: if the specified term does not occur in the polynomial then print an appropriate message

5.	Regarding the insert() method: The terms of a polynomial are to be inserted in ascending order by exponent. There will never be a need to “sort” the list. Multiple terms with the same exponent may appear in any order, but will appear after all terms with a lesser exponent and before all terms with a greater exponent

6.	For maximum credit, make sure your classes are well documented, i.e., each class method should have a relevant Javadoc.

V.	What to Turn in

A URL to your github repository via e-mail to bwoolfolk@whiteboardfederal.com 

Please also include a screenshot of your output.

VI.	 Due Date – Thursday, April 21st

Because this is the last day of class and we have two full weeks to complete it, late assignments will not be accepted. 
