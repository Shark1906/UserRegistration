package com.user.registration;

import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidationOperation {
	String patternName = "^([A-Z]{1}+[a-z]{2,})*$";
	String patternEmail = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{2,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	String patternPhone = "^([0-9]{1,2})\\s([0-9]{10})$";
	String patternPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@]).{8,}$";
	
	//User user = new User();
	Scanner sc = new Scanner(System.in);
	
	public boolean isValidFirstName(User user) {
		System.out.println("Enter FirstName");
		String input = sc.nextLine();
		try {
		user.setfName(input);
		if(Pattern.matches(patternName, user.getfName()) == false) {
			throw new UserRegistrationException("FirstName");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return Pattern.matches(patternName, user.getfName());
	}
	
	public boolean isValidLastName(User user)  {
		System.out.println("Enter LastName");
		String input = sc.nextLine();
		try {
		user.setlName(input);
		if(Pattern.matches(patternName, user.getlName()) == false) {
			throw new UserRegistrationException("LastName");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return Pattern.matches(patternName, user.getlName());
	}
	
	public boolean isValidEmail(User user) {
		System.out.println("Enter Email");
		String input = sc.nextLine();
		try {
		user.setEmailId(input);
		if(Pattern.matches(patternEmail, user.getEmailId()) == false) {
			throw new UserRegistrationException("Email");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return Pattern.matches(patternEmail, user.getEmailId()); 
	}
	
	public boolean isValidEmailId(User user) {
		try {
		if(Pattern.matches(patternEmail, user.getEmailId()) == false) {
			throw new UserRegistrationException("Email"); 
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return Pattern.matches(patternEmail, user.getEmailId());
	}
	
	public boolean isValidPhone(User user) {
		System.out.println("Enter Phone Number");
		String input = sc.nextLine();
		try {
		user.setPhoneNum(input);
		if(Pattern.matches(patternPhone, user.getPhoneNum()) == false) {
			throw new UserRegistrationException("Phone");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return Pattern.matches(patternPhone, user.getPhoneNum());
	}
	
	public boolean isValidPassword(User user) {
		System.out.println("Enter Password");
		String input = sc.nextLine();
		try {
		user.setPassword(input);
		if(Pattern.matches(patternPassword, user.getPassword()) == false) {
			throw new UserRegistrationException("Password");
		}}catch(UserRegistrationException ex) {
			System.out.println(ex);
		}
		return Pattern.matches(patternPassword, user.getPassword());
	}
}
