package com.user.registration;

import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidationOperation {
	
	
	String patternName = "^([A-Z]{1}+[a-z]{2,})*$";
	String patternEmail = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{1,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	String patternPhone = "^([0-9]{1,2})\\s([0-9]{10})$";
	String patternPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@]).{8,}$";
	
	//User user = new User();
	Scanner sc = new Scanner(System.in);
	
	public boolean isValidFirstName(User user) {
		System.out.println("Enter FirstName");
		String input = sc.nextLine();
		boolean isValid = validuser.isValid(patternName, input);
		try {
		if(isValid == false) {
			throw new UserRegistrationException("FirstName");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return isValid;
	}
	
	public boolean isValidLastName(User user)  {
		System.out.println("Enter LastName");
		String input = sc.nextLine();
		boolean isValid = validuser.isValid(patternName, input);
		try {
		if(isValid == false) {
			throw new UserRegistrationException("LastName");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return isValid;
	}
	
	public boolean isValidEmail(User user) {
		System.out.println("Enter Email");
		String input = sc.nextLine();
		boolean isValid = validuser.isValid(patternEmail, input);
		try {
		if(isValid == false) {
			throw new UserRegistrationException("Email");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return isValid; 
	}
	
	public boolean isValidEmailId(User user) {
		boolean isValid = validuser.isValid(patternEmail, user.getEmailId());
		try {
		if(isValid == false) {
			throw new UserRegistrationException("Email"); 
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return isValid;
	}
	
	public boolean isValidPhone(User user) {
		System.out.println("Enter Phone Number");
		String input = sc.nextLine();
		boolean isValid = validuser.isValid(patternPhone, input);
		try {
		if(isValid == false) {
			throw new UserRegistrationException("Phone");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return isValid;
	}
	
	public boolean isValidPassword(User user) {
		System.out.println("Enter Password");
		String input = sc.nextLine();
		boolean isValid = validuser.isValid(patternPassword, input);
		try {
		if(isValid == false) {
			throw new UserRegistrationException("Password");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return isValid;
	}
	
	@FunctionalInterface
	interface ValidUser{
		boolean isValid(String regex, String userinput);
	}
	
	ValidUser validuser = (regex, userinput) -> {return Pattern.matches(regex, userinput);};
}
