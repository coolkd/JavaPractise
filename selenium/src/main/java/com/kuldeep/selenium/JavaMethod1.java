package com.kuldeep.selenium;

public class JavaMethod1 {
	//Create method
	
	public static int multiply(int a, int b, int c) {
		
		int result = a * b * c;
		return result;
	}
        public static void main (String [] args) {
        	//Call Method
        	int x = multiply(10, 20, 30);
        	System.out.println(x);
        	
        	System.out.println(multiply(10, 20, 30));
        	
        }
}
