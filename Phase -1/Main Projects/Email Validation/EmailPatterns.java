package com.simplilearn.validation;

public class EmailPatterns {
	String[] mails =  { 
			"sai@yahoo.com", 
			"ramsai@google.com",
			"workspace@domain.com", 
			"rocky@domain.co.in", 
			"user.name1@domain.com", 
			"user_name1@domain.com", 
			"user@yahoo.corporate.in"
	};
	
	
	public boolean SearchEmail(String emailToSearch) {
		
		for (String email : mails) {
			if (email.contentEquals(emailToSearch)) {
				return true;
			}
		}
		return false;
	}
}