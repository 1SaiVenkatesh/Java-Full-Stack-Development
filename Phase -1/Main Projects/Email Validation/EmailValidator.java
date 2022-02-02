package com.simplilearn.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	
	public Pattern p = Pattern.compile(regex, Pattern.MULTILINE);
	
	public boolean Validate (String email) {
		Matcher matcher = p.matcher(email);
		
		if (matcher.find()) {
			return true;
		}
		else 
			return false;
	}
	
	
	
}