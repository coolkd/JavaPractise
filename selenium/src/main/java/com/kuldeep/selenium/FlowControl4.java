package com.kuldeep.selenium;

public class FlowControl4 {
	
	public static void main (String[]args) {
		
		int a= -50000;
		
		if ((a >= 1) && (a <=100)) {
		System.out.println("A is Small Number");
			
		}
		
		else if ((a > 100) && (a < 1000)){
		System.out.println("A is Medium Number");
			
		}
		
        else if ((a >1000) && (a <10000)){
		System.out.println("A is Big Number");
        }
		
        else if (a > 10000) {
    	System.out.println("A is High Number");
    			
        }
		else {
        System.out.println("A is either Zero or Negative Number");
}

}
}
