package com.simplilearn.validation;

import java.util.Scanner;

public class EmailValidation {
	
	public static void main (String[] args) {
		
		String email;
		try (Scanner sc = new Scanner(System.in)) {
			String done = "no";
			while (done.contentEquals("no")) {
				System.out.print("Please enter email address: ");
				email = sc.next();
				System.out.println();
			
				EmailValidator emailValidator = new EmailValidator();
				System.out.println(emailValidator.Validate(email) ?  "Valid email address\n" : "Invalid email address\n");
			

				System.out.print("Would you like to exit? (Y/N): ");
				done = sc.next();
			}
		}
		System.out.println("Thank you.");
		
	}
}