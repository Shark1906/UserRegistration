package com.user.registration;

import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidationOperation {
	String patternName = "^([A-Z]{1}+[a-z]{2,})*$";
	String patternEmail = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	String patternPhone = "^([0-9]{1,2})\\s([0-9]{10})$";
	String patternPassword = "^[[A-Z]+a-zA-Z]{8,}$";
	
	User user = new User();
	Scanner sc = new Scanner(System.in);
	
	public boolean isValidFirstName(User user) {
		System.out.println("Enter FirstName");
		String input = sc.nextLine();
		user.setfName(input);
		return Pattern.matches(patternName, user.getfName());
	}
	
	public boolean isValidLastName(User user) {
		System.out.println("Enter LastName");
		String input = sc.nextLine();
		user.setlName(input);
		return Pattern.matches(patternName, user.getlName());
	}
	
	public boolean isValidEmail(User user) {
		System.out.println("Enter Email");
		String input = sc.nextLine();
		user.setEmailId(input);
		return Pattern.matches(patternEmail, user.getEmailId());
	}
	
	public boolean isValidPhone(User user) {
		System.out.println("Enter Phone Number");
		String input = sc.nextLine();
		user.setPhoneNum(input);
		return Pattern.matches(patternPhone, user.getPhoneNum());
	}
	
	public boolean isValidPassword(User user) {
		System.out.println("Enter Password");
		String input = sc.nextLine();
		user.setPassword(input);
		return Pattern.matches(patternPassword, user.getPassword());
	}
}
