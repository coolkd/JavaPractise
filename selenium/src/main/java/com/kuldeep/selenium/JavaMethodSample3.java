package com.kuldeep.selenium;

public class JavaMethodSample3 {
	//Create method
		public static void studentRank(int marks) {
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


