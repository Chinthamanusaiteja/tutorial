package com;

import java.util.Scanner;

public class SimpleChatBot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello! i'm your chatbot. How can i assist you today?");
		while(true) {
			String userInput = scanner.nextLine().toLowerCase();
		
			if(userInput.contains("hello")) {
				System.out.println("Hello there! How can i help you?");
			}
			else if(userInput.contains("how are you")) {
				System.out.println("i'm just a program, but thanks for asking!");
			}
			else if(userInput.contains("bye")){
				System.out.println("Goodbye! Have a great day");
				break;
			}
			else {
				System.out.println("I'm sorry, I didn't understand that. Can you please rephrase?");
			}
		}
		scanner.close();
	}
}
