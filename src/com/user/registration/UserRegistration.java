package com.user.registration;

public class UserRegistration {

	public static void main(String[] args) {
		
		ValidationOperation validationOperation = new ValidationOperation();
		User user = new User();
		System.out.println("FirstName : " + validationOperation.isValidFirstName(user));
		System.out.println("LastName : " + validationOperation.isValidLastName(user));
		System.out.println("Email : " + validationOperation.isValidEmail(user));
		System.out.println("Phone Number : " + validationOperation.isValidPhone(user));
		System.out.println("Password : " + validationOperation.isValidPassword(user));
	}
}
