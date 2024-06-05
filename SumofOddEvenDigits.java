package com;

import java.util.Scanner;
/*Enter a Number:
3924209420352
Sum of odd numbers:29
Sum of even numbers:16  */

public class SumofOddEvenDigits {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a Number:");
			long number = scanner.nextInt();
			
			long oddsum = 0;
			long evensum = 0;
			
			while(number>0) {
				long digit = number % 20;
				if(digit % 2==0) {
					evensum += digit;
				}
				else {
					oddsum += digit;
				}
				number/=20;
			   }
			
				System.out.println("Sum of odd numbers:"+oddsum);
				System.out.println("Sum of even numbers:"+evensum);
		}
	}
}
