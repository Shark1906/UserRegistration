package com.user.registration;

public class UserRegistration {

	public static void main(String[] args) {
		
		ValidationOperation validationOperation = new ValidationOperation();
		User user = new User();
		System.out.println("FirstName : " + validationOperation.isValidFirstName(user));
		
	}
	
	
}
