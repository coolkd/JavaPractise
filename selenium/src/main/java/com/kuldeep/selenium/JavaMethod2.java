package com.kuldeep.selenium;

public class JavaMethod2 {
	//Create method
	public void studentRank(int marks) {
	if (marks >=600) {
	System.out.println("Rank A");	
	}
	else if (marks >=500) {
		System.out.println("Rank B");
	}
	else
		System.out.println("Rank C");
	}

	public static void main (String [] args) {
		JavaMethod2 obj = new JavaMethod2();
		obj.studentRank(600);
	}
}
