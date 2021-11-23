package com.user.registration;

import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidationOperation {
	String patternName = "^([A-Z]{1}+[a-z]{2,})*$";
	
	User user = new User();
	Scanner sc = new Scanner(System.in);
	
	public boolean isValidFirstName(User user) {
		System.out.println("Enter FirstName");
		String input = sc.nextLine();
		user.setfName(input);
		return Pattern.matches(patternName, user.getfName());
	}
}
