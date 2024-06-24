package com;

import java.util.Scanner;

public class OnlineQuiz {
	static String username;
	static String password;
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Welcome to the Online Quiz!");
		System.out.println("Total questions:4");
		
		//login
		login(scanner);
		
		//Update Profile and Password
		updateprofile(scanner);
		
		//Selecting answers for MCQs
		selectAnswers(scanner);
		
		//Closing session and LogOut
		closeSession();
		
		scanner.close();
		
	}

	public static void login(Scanner scanner) {
		System.out.println("Enter your username:");
		username =scanner.nextLine();
		
		System.out.println("Enter your password:");
		password = scanner.nextLine();
		System.out.println("Login succesful! Welcome, "+username+"!");
		
	}
	public static void updateprofile(Scanner scanner) {
		System.out.println("Would you like to update your profile or password ?(Y/N) ");
		String choice = scanner.nextLine();
		
		if(choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter your new password:");
			password = scanner.nextLine();
			System.out.println("Proofile and password updated succesfully!");
		}
		
	}
	public static void selectAnswers(Scanner scanner) {
		System.out.println("Let's start the quiz!");
		System.out.println("1.What is the capital of france");
		System.out.println("A.Londan B.paris c.Berlin D.Rome");
		System.out.println("Enter your answer(A/B/C/D):");
		String answer = scanner.nextLine();
		
		
		if(answer.equalsIgnoreCase("B")) {
			System.out.println("Correct answer!");
		}
		else {
			System.out.println("Incorrect answer.The correct answer is B.paris");
		}
		System.out.println("-----------------");
		
		System.out.println("2.What is the Virat's jersy number");
		System.out.println("A.81 B.17 C.18 D.28");
		System.out.println("Enter your answer(A/B/C/D):");
		String answer2 = scanner.nextLine();
		
		if(answer2.equalsIgnoreCase("C")) {
			System.out.println("Correct answer!");
		}
		else {
			System.out.println("Incorrect answer.The correct answer is C.18");
		}
		System.out.println("-----------------");
		
		System.out.println("3.Which company developed the java program");
		System.out.println(" A.Sun Microsystems B.oracle C.Microsoft D.apple");
		System.out.println("Enter your answer(A/B/C/D):");
		String answer3 = scanner.nextLine();
		
		if(answer3.equalsIgnoreCase("A")) {
			System.out.println("Correct answer!");
			
		}
		else 
		{
			System.out.println("Incorrect answer.The correct answer is A.Sun Microsystems");
		}
		System.out.println("-----------------");
		
			
		System.out.println("4.Which company have currently owns java ");
		System.out.println(" A.Sun Microsystems B.oracle C.Microsoft D.apple ");
		System.out.println("Enter your answer(A/B/C/D):");
		String answer4 = scanner.nextLine();
		
		if(answer4.equalsIgnoreCase("B")) {
			System.out.println("Correct answer!");
			
		}
		else 
		{
			System.out.println("Incorrect answer.The correct answer is B.oracle");
		}
	
	}
	
	public static void closeSession() {
		System.out.println("Thank you for taking the quiz, "+username+"!");
		System.out.println("Session closed.Loggin out....!");
		
		
	}
}
