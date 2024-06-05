package com;

import java.util.Scanner;

public class CountDigit {
	/* Sample test cases:
	 * The first test sample:
	 Enter an integer
	447474
	Number of occurrences of digit 4: 4
	
	*The second test sample
	Enter an integer
	12
	Number of occurrences of digit 4: 0*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int number = scanner.nextInt();
		
		int count = 0;
		
		while(number>0) {
			int digit = number % 10;
			if (digit==4) {
				count++;
			}
			number /=10;
		}
		System.out.println("Number of occurrences of digit 4: "+count);
	}
}
