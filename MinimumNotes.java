package com;
import java.util.Scanner;

public class MinimumNotes {
	/*Sample test casees:
	 The first test:
	 Enter the change amount in Rs.:
1200
The smallest number of notes needed to give Rs. 0is:12

the Second test:
Enter the change amount in Rs.:
242
The smallest number of notes needed to give Rs. 0is:7 */
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the change amount in Rs.:");
		int change = scanner.nextInt();
		int[] notes = {100,50,10,5,2,1};
		int totalNotes = 0;
		
		for(int note:notes) {
			if(change>=note) {
				int numNotes = change/note;
				totalNotes+=numNotes;
				change-=numNotes*note;
			}
		}
		
			System.out.println("The smallest number of notes needed to give Rs. "+change+ "is:"+totalNotes);
		
	}
}