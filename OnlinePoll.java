package com;

import java.util.Scanner;

public class OnlinePoll {
	
	static String adminUsername = "admin";
	static String adminPassword = "admin123";
	static String userUsername;
	static String userPassword;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Online Poll System!");
		//Admin Stage
		adminStage(scan);
		
		//user/voter Stage
		userStage(scan);
		
		scan.close();
	}
	
	public static void adminStage(Scanner scan) {
		System.out.println("Admin Login");
		System.out.println("Enter admin username");
		String username = scan.nextLine();
		
		System.out.println("Enter admin password: ");
		String password = scan.nextLine();
		
		if(username.equals(adminUsername) && password.equals(adminPassword)) {
			System.out.println("Admin login succesful!");
			
			//Admin functionalities
			manageCandidates();
			managevotingcandidates();
			viewElectionresults();
		}
		else {
			System.out.println("Invalid admin credentials. Existing....");
			return;
		}
	}
	public static void userStage(Scanner scan) {
		System.out.println("User/voter Stage");
		userUsername = scan.nextLine();
		
		System.out.println("Enter your password: ");
		userPassword = scan.nextLine();
		
		System.out.println("User login succesful! Welcome, "+userUsername+ "!");
		
		//User functionalities
		registerUser();
		chooseCandidateToVote();
		castVote();
	}

	public static void manageCandidates() {
		System.out.println("Admin: Manage Election  cadiadates");
		//Implement candidates management functionality
	}
	
	public static void managevotingcandidates() {
		System.out.println("Admin: Manage voting Candidates");
		//Implement voting candidates management functionality
	}
	
	public static void viewElectionresults() {
		System.out.println("Admin: View Election Results");
		//Implement viewing election results functionality
	}
	
	public static void registerUser() {
		System.out.println("User: Registration");
		//implement user registration functionality
	}
	
	public static void chooseCandidateToVote() {
		System.out.println("User: Choose a candidate to vote");
		//Implement candidate selection functionality
	}
	
	public static void castVote() {
		System.out.println("User: Cast  Vote");
		//Implements casting vote functionality
	}
}
