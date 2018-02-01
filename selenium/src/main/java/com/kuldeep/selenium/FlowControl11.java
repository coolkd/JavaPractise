package com.kuldeep.selenium;

public class FlowControl11 {
	
	public static void main (String[]args) {
		
		int [] mathoperations = new int [3];
		int a=10, b=20;
		
		mathoperations[0]= a+b;
		mathoperations[1]= a-b;
		mathoperations[2]= a*b;
		
		for (int operation: mathoperations) {
		System.out.println(operation);
		}
	}
	
}

