package com.kuldeep.selenium;

public class FlowControl6 {
	
	public static void main (String [] args) {
		int a=10, b=50, c=70, d=20;
		
		if (((a > b) && (a>c)) && (a>d)) {
			System.out.println("A is Big Number");
			
		}
		else if (((b > a) && (b>c) && (b>d))) {
		System.out.println("B is Big Number");
	    
	    }

	    else if (((c>a) && (c>b) && (c>d))) {
	    System.out.println("C is big Number");
	    
	    }

        else {
        System.out.println("D is big Number");

	
}
}
}

