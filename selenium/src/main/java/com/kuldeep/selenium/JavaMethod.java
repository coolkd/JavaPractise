package com.kuldeep.selenium;

public class JavaMethod {
//User defined method
	
public int multiply(int a, int b, int c) {
	int result = a*b*c;
	return result;
	
	
}	
public static void main (String []args){
	//Create object
	JavaMethod abc = new JavaMethod();
	//Call method
	int x = abc.multiply(10, 50, 35);
	System.out.println(x);
	
	System.out.println(abc.multiply(10, 50, 35));
	
}
{
	
		

	}

}
