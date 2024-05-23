package com;

import java.util.Scanner;

public class RideEligibility {
	/* sample test cases:
	 The first test sample:
	 Enter the age:
	20
	Allowed
	 
	 The second test sample:
	 Enter the age:
		12
	Not Allowed  */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age:");
		int age = scanner.nextInt();
		
		if(age<15 || age>60) {
			System.out.println("Not Allowed");
		}
		else {
			System.out.println("Allowed");
		}
	}
}
