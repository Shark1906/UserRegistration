package com.user.registration;

public class UserRegistrationException extends Exception {
	
	private static final long serialVersionUID = 1L;

	enum Exception{FirstName,LastName,Email,Password,Phone};
	
	Exception exception;
	
	UserRegistrationException(String exception){
		if(exception == "FirstName") {
			this.exception = Exception.FirstName;
		}else if (exception == "LastName") {
			this.exception = Exception.LastName;
		}else if (exception == "Email") {
			this.exception = Exception.Email;
		}else if (exception == "Password") {
			this.exception = Exception.Password;
		}else if (exception == "Phone") {
			this.exception = Exception.Phone;
		}
			
	}
	
	public String toString() {
		return "Exception Here : Invalid " + exception;
	}

}
